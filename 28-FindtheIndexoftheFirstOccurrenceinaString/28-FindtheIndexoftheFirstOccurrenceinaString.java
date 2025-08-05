// Last updated: 8/5/2025, 2:25:25 PM
class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length(), needleLength = needle.length();
        // to have enough string to match => haystackLength - needleLength
        for(int i=0; i<= haystackLength - needleLength; i++ ){
    // if 1st char of needle matches only then match the whole needle string
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i + needleLength).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}