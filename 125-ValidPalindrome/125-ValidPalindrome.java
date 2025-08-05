// Last updated: 8/5/2025, 12:36:36 PM
class Solution {
    public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
		return (s.equals( new StringBuffer(s).reverse().toString()));
    }
}