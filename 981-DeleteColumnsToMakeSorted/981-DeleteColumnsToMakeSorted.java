// Last updated: 8/5/2025, 12:36:23 PM
class Solution {
    public int minDeletionSize(String[] strs) {
        int deleteCount = 0, strlen = strs.length,wordlen = strs[0].length();
        for(int i=0; i<wordlen;i++){
            for(int j=1; j<strlen; j++){
                if(strs[j-1].charAt(i)>strs[j].charAt(i)){
                    deleteCount++;
                    break;
                }
            }
        }
        return deleteCount;

        
    }
}