// Last updated: 8/5/2025, 12:36:57 PM
class Solution {
    public boolean isPalindrome(int x) {
            int rev = 0;
            int temp = x;
        if(x==0)
            return true;
    
        while(x>0){
            rev = x%10 + rev*10;
            x/=10;
        }
        if(rev==temp)
            return true;
        else
            return false;
        
    }
}