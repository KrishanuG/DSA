// Last updated: 4/10/2026, 11:52:50 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] str = s.trim().split("\\s+");
4        return str[str.length - 1].length(); 
5    }
6}