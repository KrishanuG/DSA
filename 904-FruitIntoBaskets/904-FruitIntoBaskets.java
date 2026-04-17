// Last updated: 4/17/2026, 2:13:09 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int start = 0, end = 0;
4        int n = fruits.length, maxLen = 0;
5        HashMap<Integer, Integer> freq = new HashMap<>();
6        while (end < n) {
7            freq.put(fruits[end], freq.getOrDefault(fruits[end], 0) + 1);
8            while (freq.size() > 2) {
9                freq.put(fruits[start], freq.get(fruits[start]) - 1);
10                if (freq.get(fruits[start]) == 0) {
11                    freq.remove(fruits[start]);
12                }
13                start++;
14            }
15            int currLen = end - start + 1;
16            maxLen = Math.max(maxLen, currLen);
17            end++;
18        }
19        return maxLen;
20    }
21}