// Last updated: 4/10/2026, 11:55:37 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int start=0;
        for(int i=s.length()-1;i>=0;i--){
            if(start==0 && s.charAt(i)==' ')
                continue;
            if(s.charAt(i)==' ')
                break;
            start++;
        }
        return start;
    }
}