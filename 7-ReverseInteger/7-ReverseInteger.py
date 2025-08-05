# Last updated: 8/5/2025, 12:37:09 PM
class Solution:
    def reverse(self, x: int) -> int:  
        if x >= 2**31-1 or x <= -2**31:
                return 0
        else:
            s = str(x)
            if x >= 0 :
                rev = s[::-1]
            else:
                t = s[1:] 
                t1 = t[::-1] 
                rev = "-" + t1
        if int(rev) >= 2**31-1 or int(rev) <= -2**31: return 0
        else: return int(rev)