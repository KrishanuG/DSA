# Last updated: 8/5/2025, 12:36:39 PM
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        if n < 0:
            return 1/self.myPow(x,-n)
        t= self.myPow(x,n>>1)
        if n&1:
            return x*t*t
        else:
            return t*t