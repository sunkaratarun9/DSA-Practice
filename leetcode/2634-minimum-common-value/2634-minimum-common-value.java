class Solution {

    private boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public int getCommon(int[] nums1, int[] nums2) {

        // Iterate through smaller array
        if (nums1.length > nums2.length) {
            return getCommon(nums2, nums1);
        }

        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                return num;
            }
        }

        return -1;
    }
}