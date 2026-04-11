// Last updated: 4/11/2026, 9:59:45 PM
1class Solution {
2
3public boolean checkInclusion(String s1, String s2) {
4
5    int[] freq1 = new int[26];  // frequency of s1
6    int[] freq2 = new int[26];  // frequency of current window in s2
7
8    int n = s1.length();
9    int m = s2.length();
10
11    // If s1 longer than s2 -> impossible
12    if (n > m) return false;
13
14    // Build frequency array for s1
15    for (int i = 0; i < n; i++) {
16        freq1[s1.charAt(i) - 'a']++;
17    }
18
19    int left = 0;
20
21    // Slide window over s2
22    for (int right = 0; right < m; right++) {
23
24        // Add current character to window
25        freq2[s2.charAt(right) - 'a']++;
26
27        // If window exceeds size n, remove leftmost character
28        if (right - left + 1 > n) {
29            freq2[s2.charAt(left) - 'a']--;
30            left++;
31        }
32
33        // If window size equals n, compare frequency arrays
34        if (right - left + 1 == n && Arrays.equals(freq1, freq2)) {
35            return true;
36        }
37    }
38
39    return false;
40}
41}