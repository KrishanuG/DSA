# Last updated: 8/5/2025, 12:36:48 PM
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        n=len(nums)
        i=0
        while i<n:
            if nums[i] == val: 
                nums.pop(i)
                n-=1
            else:
                i+=1
        return n
        