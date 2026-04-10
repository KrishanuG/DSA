// Last updated: 4/10/2026, 12:27:34 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        // Arrays to track last seen positions of characters in s and t
7        int[] m1 = new int[256];
8        int[] m2 = new int[256];
9
10        for(int i = 0; i<s.length(); i++){
11            // if mapping is inconsistent
12            if(m1[s.charAt(i)] != m2[t.charAt(i)]){
13                return false;
14            }
15            // Update last seen index for both characters
16              m1[s.charAt(i)] = i + 1;
17              m2[t.charAt(i)] = i + 1;
18        }
19        return true;
20    }
21}