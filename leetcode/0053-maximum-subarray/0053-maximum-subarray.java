class Solution {
    //Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxS=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0 ; i<n ;i++){
            sum+=nums[i];
            maxS = (maxS<sum) ? sum: maxS;
            if(sum<0){
                sum=0;
            }
        }

        return maxS;
    }
}