class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        #status= False
        # num=[]
        # for i in range(len(nums)):
        #     if nums[i] not in num:
        #         num.append(nums[i])
        #     else:
        #         return False
        # return True
        flag = False #True
        if len(set(nums)) != len(nums):
            flag = True
        return flag