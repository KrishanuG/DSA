// Last updated: 4/8/2026, 2:05:49 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int num:nums) {
            sum += num;
            maxSum = sum > maxSum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }

        return maxSum;
    }
}