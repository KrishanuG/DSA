// Last updated: 4/11/2026, 9:46:30 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4        // build the frequency
5        for (char ch : s.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8
9        //traverse the string
10        for (int i = 0; i < s.length(); i++) {
11            if (freq[s.charAt(i) - 'a'] == 1) {
12                return i;
13            }
14        }
15        return -1;
16    }
17}