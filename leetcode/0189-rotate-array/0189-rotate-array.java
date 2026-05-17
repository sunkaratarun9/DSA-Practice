class Solution {
    public void reverse (int[] nums,int left , int right){
        while(left<right){
            int temp = nums[left];
            nums[left++]= nums[right];
            nums[right--] = temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n;
        reverse(nums, 0, n-1);   
        reverse(nums, 0, d-1);   
        reverse(nums, d, n-1);   
    }
}