// Last updated: 1/7/2026, 3:38:04 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder result = new StringBuilder();
4        int counter = 0; // this decide the level of parentheses
5        //if counter > 0 then we are inside of valid primitive
6        for (char ch : s.toCharArray()) {
7            // If we encounter '(', increase the counter
8            if (ch == '(') {
9                // If we're inside a primitive, add '(' to result
10                if (counter > 0) {
11                    result.append(ch);
12                }
13                // Increase the nesting counter for '('
14                counter++;
15            }
16            if (ch == ')') {
17                // If we encounter '(', decrease the counter
18                counter--;
19                // If we're inside a primitive, add ')' to result
20                if (counter > 0) {
21                    result.append(ch);
22                }
23            }
24        }
25        return result.toString();
26    }
27}