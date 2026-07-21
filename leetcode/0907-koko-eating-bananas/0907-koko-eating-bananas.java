class Solution {
    int findMax(int[] arr){
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>max) max=arr[j];
        }
        return max;
    }
    int calculateHours(int[] arr,int mid){
        int totalhours=0;
        for (int i=0; i<arr.length;i++){
            totalhours += Math.ceil((double)arr[i]/(double)mid) ;
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=findMax(piles);
        
        while(low <= high){
            int mid=(low+high)/2;
            int hrs=calculateHours(piles,mid);
            if(hrs<=h){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}