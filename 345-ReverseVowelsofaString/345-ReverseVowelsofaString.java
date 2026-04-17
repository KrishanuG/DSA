// Last updated: 4/17/2026, 2:02:35 PM
1class Solution {
2    public String reverseVowels(String s) {
3
4        char[] chars = s.toCharArray();
5
6        int start = 0;
7
8        int end = s.length() - 1;
9
10        while (start < end) {
11            while (start < end && !isVowel(chars[start])) {
12                start++;
13            }
14            while (start < end && !isVowel(chars[end])) {
15                end--;
16            }
17
18            if (start < end) {
19                char temp = chars[start];
20                chars[start] = chars[end];
21                chars[end] = temp;
22                start++;
23                end--;
24            }
25
26        }
27
28        return new String(chars);
29    }
30
31    private boolean isVowel(char c) {
32        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
33                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
34    }
35}