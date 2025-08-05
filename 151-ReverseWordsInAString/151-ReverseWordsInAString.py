# Last updated: 8/5/2025, 12:36:33 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        st= s.split();
        st=st[-1::-1]
        s1=' '.join(st)
        return s1
        
        
        