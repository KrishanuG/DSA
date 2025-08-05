# Last updated: 8/5/2025, 12:37:06 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        temp,rev= x,0
        while temp>0:
            rev=(rev*10)+(temp%10)
            temp//=10
        return rev == x