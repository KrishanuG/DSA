# Last updated: 8/5/2025, 12:36:41 PM
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for s in strs:
            srtds = ''.join(sorted(s))
            if srtds in dic:
                dic[srtds].append(s)
            else:
                dic[srtds] = [s]
        return dic.values()
