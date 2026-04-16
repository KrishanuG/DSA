// Last updated: 4/16/2026, 12:19:50 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int start = 0;
4        int end = s.length - 1;
5
6        while (start < end) {
7            char temp = s[start];
8            s[start] = s[end];
9            s[end] = temp;
10            start++;
11            end--;
12        }
13    }
14}