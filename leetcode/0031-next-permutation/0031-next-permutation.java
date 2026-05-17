class Solution {
    public void reverse(int[] arr , int indx , int n){
        while(indx<n-1){
            int temp = arr[indx];
            arr[indx++] =arr[n-1];
            arr[n-1] = temp;
            n--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int indx=-1;
        //find break through in the pattern
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                indx=i;
                break;
            }
        }
        if(indx==-1){
            reverse(nums,0,n);
            return;
        }
        //find smallest greater element
        
        for(int i=n-1; i>=0; i--){
            if (nums[i] > nums[indx] ) {
                int temp = nums[i];
                nums[i] = nums[indx];
                nums[indx] = temp;
                break;
            }
        }
        //reverse the array
        reverse(nums,indx+1,n);
            
    }
}