// Last updated: 4/8/2026, 2:01:41 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = nums[0];
4        int currSum = nums[0];
5        for (int i = 1; i < nums.length; i++) {
6            currSum = Math.max(nums[i], currSum + nums[i]);
7            maxSum = Math.max(maxSum, currSum);
8        }
9        return maxSum;
10    }
11}