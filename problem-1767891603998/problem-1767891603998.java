// Last updated: 1/8/2026, 10:30:03 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4
5        int[] freq = new int[26]; // 26 letter alphabets
6
7        for(int i=0;i<s.length();i++){
8            freq[s.charAt(i) - 'a']++; //// Increment frequency for each character in str1
9        }
10
11         for(int i=0;i<t.length();i++){
12            freq[t.charAt(i) - 'a']--; //// Decrement frequency for each character in str2
13        }
14        // Check if all frequencies are zero, meaning both strings have the same characters
15        for (int i = 0; i < 26; i++) {
16            if (freq[i] != 0)  // If any frequency is non-zero, they are not anagrams
17                return false;
18        }
19
20        return true;
21    }
22}