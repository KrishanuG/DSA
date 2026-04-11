// Last updated: 4/11/2026, 9:33:45 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length())
4            return false;
5
6        int[] freq = new int[26]; // 26 letter alphabets
7        // Increment frequency for each character in str1
8        for (int i = 0; i < s.length(); i++) {
9            freq[s.charAt(i) - 'a']++;
10        }
11        // Decrement frequency for each character in str2
12        for (int i = 0; i < t.length(); i++) {
13            freq[t.charAt(i) - 'a']--;
14        }
15        // Check if all frequencies are zero, meaning both strings have the same characters
16        for (int i = 0; i < 26; i++) {
17            if (freq[i] != 0) // If any frequency is non-zero, they are not anagrams
18                return false;
19        }
20
21        return true;
22    }
23}