// Last updated: 4/14/2026, 2:11:07 PM
1class Solution {
2    public int fib(int n) {
3        if (n == 0)
4            return 0;
5        if (n == 1)
6            return 1;
7        int prev1 = 0, prev2 = 1, current = 0;
8        for (int i = 2; i <= n; i++) {
9            current = prev1 + prev2;
10            prev1 = prev2;
11            prev2 = current;
12        }
13        return current;
14    }
15}