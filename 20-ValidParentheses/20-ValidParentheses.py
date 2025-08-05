# Last updated: 8/5/2025, 12:36:56 PM
class Solution:
    def isValid(self, s: str) -> bool:
        while "()" in s or "{}" in s or '[]' in s:
            s = s.replace("()", "").replace("{}", "").replace("[]", "")
        return s == ""
        
        