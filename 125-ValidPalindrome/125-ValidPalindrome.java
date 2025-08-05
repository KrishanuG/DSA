// Last updated: 8/5/2025, 4:02:05 PM
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            char currentFirst = s.charAt(start);
            char currentLast = s.charAt(end);
            if (!Character.isLetterOrDigit(currentFirst)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(currentLast)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}