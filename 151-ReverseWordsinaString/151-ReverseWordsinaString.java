// Last updated: 4/7/2026, 1:09:27 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] st = s.trim().split("\\s+");
4        StringBuilder sb = new StringBuilder();
5        for (int i = st.length - 1; i >= 0; i--) {
6            sb.append(st[i]);
7            if (i > 0) {
8                sb.append(" ");
9            }
10        }
11        return sb.toString();
12    }
13}