// Last updated: 4/19/2026, 5:20:14 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        String str = s + s;
7
8        return str.contains(goal);
9    }
10}