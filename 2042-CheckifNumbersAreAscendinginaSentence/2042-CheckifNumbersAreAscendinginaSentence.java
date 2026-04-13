// Last updated: 4/13/2026, 6:44:56 PM
class Solution {
    public boolean areNumbersAscending(String s) {
         int prev = 0;
        
        for(String token: s.split(" ")) {
            try {
                int number = Integer.parseInt(token);
                if(number <= prev)
                    return false;
                prev = number;
            }
            catch(Exception e) {}
        }
        
        return true;
    }
}