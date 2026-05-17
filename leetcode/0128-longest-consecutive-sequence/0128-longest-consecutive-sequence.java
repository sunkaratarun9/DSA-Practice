class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){
            return 0;
        }
        Arrays.sort(nums);
        int c=0;
        int lsmall =Integer.MIN_VALUE;
        int longest = 1; 
        for(int i=0;i < nums.length;i++){
            if(nums[i]-1 == lsmall){
                c++;
                lsmall = nums[i];
            }
            else if(lsmall != nums[i]){
                c=1;
                lsmall= nums[i];
            }
            longest= Math.max(longest,c);
        }
        return longest;
    }
}