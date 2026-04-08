// Last updated: 4/8/2026, 4:18:47 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        //input [7,1,5,3,6,4] , output 5
4        int buy = prices[0];
5        int profit = 0;
6        for (int i = 1; i < prices.length; i++) {
7            if (prices[i] < buy) {
8                buy = prices[i];
9            } else if (prices[i] - buy > profit) {
10                profit = prices[i] - buy;
11            }
12        }
13        return profit;
14    }
15}