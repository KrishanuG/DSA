// Last updated: 4/10/2026, 11:39:44 AM
1class Solution {
2    public int romanToInt(String s) {
3        int[] a = new int[26];
4        a['I' - 'A'] = 1;
5        a['V' - 'A'] = 5;
6        a['X' - 'A'] = 10;
7        a['L' - 'A'] = 50;
8        a['C' - 'A'] = 100;
9        a['D' - 'A'] = 500;
10        a['M' - 'A'] = 1000;
11
12        int prev = 0;
13        int result = 0;
14        for (int i = s.length() - 1; i >= 0; i--) {
15            int curr = a[s.charAt(i) - 'A'];
16            if (curr < prev) {
17                result = result - curr;
18            } else {
19                result = result + curr;
20            }
21            prev = curr;
22        }
23        return result;
24    }
25}