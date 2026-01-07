// Last updated: 1/7/2026, 4:48:12 PM
1class Solution {
2    public String largestOddNumber(String num) {
3        int index = -1;
4        int i;
5        for (i = num.length() - 1; i >= 0; i--) {
6            if ((num.charAt(i) - '0') % 2 == 1) {
7                //(s.charAt(i) - '0')   // gives integer value of digit
8                index = i;
9                break;
10            }
11
12        }
13        if (index == -1)
14            return "";
15
16        // if there is leading Zero up to the odd digit, remove it as it does not help with the calculation . Ex 023 -> 23
17        i = 0;
18        if (i <= index && num.charAt(i) == '0')
19            i++;
20        // Return substring from first non-zero to odd digit
21        return num.substring(i, index + 1);
22    }
23}