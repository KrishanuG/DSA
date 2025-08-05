// Last updated: 8/5/2025, 12:36:21 PM
class Solution {
   public boolean detectCapitalUse(String word) {
        int capitals = 0;
        for(char ch: word.toCharArray()){
            if(Character.isUpperCase(ch)) 
                capitals++;
        }
        // if all chars in word are in capital or all chars in word in small
        if(capitals==word.length() || capitals==0) 
            return true;
        // when only fist car in word is in caps
        else if (capitals==1 && Character.isUpperCase(word.charAt(0))) 
            return true;

        return false;
    }
}