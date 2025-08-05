// Last updated: 8/5/2025, 12:36:24 PM
class Solution {
    public int findLUSlength(String a, String b) {
         return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}