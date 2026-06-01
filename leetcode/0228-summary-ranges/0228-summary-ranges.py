class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        arr = []
        n = len(nums)
        i = 0
        while i < n :
            s = str(nums[i])
            e = ""
            while i < n-1 :
                if nums[i+1] - nums[i] == 1 :
                    i += 1
                else:
                    break
            e = str(nums[i])
            if s == e:
                arr.append(s)
                i += 1
                continue
            s += "->" + e
            arr.append(s)
            i+=1
        return arr