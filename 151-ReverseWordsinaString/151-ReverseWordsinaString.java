// Last updated: 1/7/2026, 4:08:06 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] st = s.trim().split("\\s+");
4        StringBuilder result = new StringBuilder();
5        for (int i = st.length - 1; i >= 0; i--) {
6            result.append(st[i]);
7            if (i != 0)
8                result.append(" ");
9        }
10        return result.toString();
11    }
12}