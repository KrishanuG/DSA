# Last updated: 8/5/2025, 12:37:10 PM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d={}
        for i in range(len(nums)):
            p=target-nums[i] 
            if p not in d:
                d[nums[i]]=i
            else:
                j=d[target-nums[i]]
                return [j,i]
        