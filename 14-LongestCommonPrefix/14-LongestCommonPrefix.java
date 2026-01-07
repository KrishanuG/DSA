// Last updated: 1/7/2026, 5:57:11 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3  /*
4** The common prefix across all strings must exist between the smallest and largest string when sorted lexicographically.
5** Sorting the array helps bring these boundary strings to the extremes.
6** By comparing only the first and last strings, we can determine the full common prefix shared by the entire array.
7** Character-wise comparison from the beginning allows us to identify where the prefix stops.
8** The point at which the characters start differing marks the end of the shared prefix.
9** The portion before this mismatch is the longest common prefix among all strings.*/
10        StringBuilder result = new StringBuilder();
11        Arrays.sort(strs);
12        String first = strs[0];
13        String last = strs[strs.length -1];
14
15        for(int i=0; i<Math.min(first.length(), last.length()); i++){
16            if(first.charAt(i) != last.charAt(i))
17            {
18                return result.toString();
19            }
20            result.append(first.charAt(i));
21        }
22        return result.toString();
23    }
24}