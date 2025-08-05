# Last updated: 8/5/2025, 12:36:54 PM
class Solution:
    def romanToInt(self, s: str) -> int:
        roman = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
        }
        last = "M"
        res = 0
        
        for current in s:
            res += roman[current]
            if roman[current] > roman[last]:
                res -= 2 * roman[last]
            last = current
        
        return res