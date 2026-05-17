class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums=set(nums)
        # for i in range(1,max(nums)+1):
        #     if i not in nums:
        #         return i
        # return max(nums)+1
        hard=1
        while hard in nums:
            hard+=1
        return hard