// Last updated: 4/9/2026, 2:16:25 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if(s.length()<=1){
4            return s;
5        }
6
7        int maxLen=1;
8        String maxStr=s.substring(0,1);
9
10        for(int i=0; i<s.length(); i++){
11            for(int j=i+1; j<=s.length();j++){
12                if(j-i>maxLen && isPalindrome(s.substring(i,j))){
13                    maxLen= j-i;
14                    maxStr= s.substring(i,j);
15                }
16            }
17        }
18        return maxStr;
19    }
20
21    private boolean isPalindrome(String str){
22        int left=0;
23        int right= str.length()-1;
24
25        while(left<right){
26            if(str.charAt(left)!=str.charAt(right)){
27                return false;
28            }
29            left++;
30            right--;
31        }
32        return true;
33    }
34}