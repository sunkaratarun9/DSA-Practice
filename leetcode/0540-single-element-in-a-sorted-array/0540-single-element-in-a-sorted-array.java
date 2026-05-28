class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            boolean even = mid%2 == 0 && nums[mid] == nums[mid +1];
            boolean odd = mid %2 == 1 && nums[mid] == nums[mid - 1];
            if( even || odd )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }   
}