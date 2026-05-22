class Solution {
    public void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int left =low;
        int right=mid+1;
        int i=0;
        while( left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp[i++]=arr[left++];
            }
            else{
                temp[i++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[i++]=arr[left++];
        }
        while(right<=high){
            temp[i++]=arr[right++];
        }

        //copy back
        for(int j=0;j<temp.length;j++){
            arr[low+j]=temp[j];
        }        
    }
    public int countPair(int[] arr,int low,int mid,int high){
        int count=0;
        int right = mid+1;
        for(int i= low;i<=mid;i++){
            while(right<=high && (arr[i]>(long)2*arr[right])){
                right++;
            }
            count =count+(right-(mid+1));
        }
        return count;
    }
    public int mergeSort(int[] arr,int low,int high){
        int count=0;
        if(low>=high) return count;
        int mid = (low)+(high-low)/2;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=countPair(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        int low = 0;
        int high = nums.length-1; 
        return new Solution().mergeSort(nums,low,high);
    }
}