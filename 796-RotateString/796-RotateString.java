// Last updated: 4/7/2026, 11:40:15 AM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        String conCatString = s + s;
7
8        return conCatString.contains(goal);
9    }
10}