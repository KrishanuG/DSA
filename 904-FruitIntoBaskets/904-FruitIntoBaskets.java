// Last updated: 4/17/2026, 2:11:28 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        StringBuilder sb = new StringBuilder();
5        for(String word : words){
6            StringBuilder revWord = new StringBuilder(word).reverse();
7            sb.append(revWord).append(" ");
8        }
9    
10        return sb.toString().trim();
11    }
12}