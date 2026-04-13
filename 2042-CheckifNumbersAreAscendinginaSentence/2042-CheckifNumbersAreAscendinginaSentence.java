// Last updated: 4/13/2026, 6:43:53 PM
1class Solution {
2    public boolean areNumbersAscending(String s) {
3        String[] str = s.trim().split("\\s+");
4        int prev = -1;
5
6        for (String word : str) {
7            if (Character.isDigit(word.charAt(0))) {
8
9                int num = Integer.parseInt(word);
10
11                if (num <= prev) {
12                    return false;
13                }
14                prev = num;
15            }
16        }
17
18        return true;
19    }
20}
21