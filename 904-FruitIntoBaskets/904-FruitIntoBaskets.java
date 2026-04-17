// Last updated: 4/17/2026, 1:54:26 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] ch = s.toCharArray();
4        int i = 0, j = ch.length - 1;
5        while (i < j) {
6            if (!Character.isLetter(ch[i])) {
7                i++;
8            } else if (!Character.isLetter(ch[j])) {
9                j--;
10            } else {
11                char temp = ch[i];
12                ch[i] = ch[j];
13                ch[j] = temp;
14                i++;
15                j--;
16            }
17        }
18        return new String(ch);
19    }
20}