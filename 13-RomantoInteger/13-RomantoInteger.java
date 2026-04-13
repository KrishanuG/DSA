// Last updated: 4/13/2026, 6:22:22 PM
1class Solution {
2    public int myAtoi(String s) {
3        String str = s.trim();
4        int i = 0, sign = 1;
5        long ans = 0;
6        if (str.length() == 0)
7            return 0;
8
9        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
10            sign = (str.charAt(i) == '-') ? -1 : 1;
11            i++;
12        }
13
14        while (i < str.length()) {
15            char ch = str.charAt(i);
16            if (ch < '0' || ch > '9')
17                break;
18            ans = ans * 10 + (ch - '0');
19            // Overflow check
20            if (sign == 1 && ans > Integer.MAX_VALUE) {
21                return Integer.MAX_VALUE;
22            }
23            if (sign == -1 && ans > (long)Integer.MAX_VALUE + 1) {
24                return Integer.MIN_VALUE;
25            }
26            i++;
27        }
28
29        return (int) (ans * sign);
30    }
31}