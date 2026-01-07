// Last updated: 1/7/2026, 3:40:25 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder result = new StringBuilder();
4        int counter = 0; // this decide the level of parentheses
5        //if counter > 0 then we are inside of valid primitive
6        for (char ch : s.toCharArray()) {
7            // If we encounter '(', increase the counter
8            if (ch == '(') {
9                // If we're inside a primitive, add '(' to result
10                if (counter > 0)
11                    result.append(ch);
12                // Increase the nesting counter for '('
13                counter++;
14            }
15            else if (ch == ')') {
16                // If we encounter '(', decrease the counter
17                counter--;
18                // If we're inside a primitive, add ')' to result
19                if (counter > 0)
20                    result.append(ch);
21
22            }
23        }
24        return result.toString();
25    }
26}