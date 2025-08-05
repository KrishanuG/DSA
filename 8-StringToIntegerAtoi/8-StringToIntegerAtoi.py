# Last updated: 8/5/2025, 12:36:59 PM
class Solution:
    def myAtoi(self, str: str) -> int:
        str = str.strip()
        if not str:
            return 0
        r,s,st =0,1,0 
        if str[st] in ['-', '+']:
            if str[st] == '-':
                s = -1
            st += 1
        for c in str[st:]:
            if c == '0' and r == 0:
                continue
            if not c.isdigit():
                break
            r = r * 10 + int(c)
        r = r * s
        if r > 0: return min(r, 2 ** 31 - 1)
        else: return max(-2 ** 31, r)