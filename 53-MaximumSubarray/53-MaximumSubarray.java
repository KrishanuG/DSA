// Last updated: 4/8/2026, 2:06:33 PM
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
12
13//another approach
14// class Solution {
15//     public int maxSubArray(int[] nums) {
16//         int sum = 0;
17//         int maxSum = Integer.MIN_VALUE;
18
19//         for (int num : nums) {
20//             sum += num;
21//             maxSum = sum > maxSum ? sum : maxSum;
22//             sum = sum < 0 ? 0 : sum;
23//         }
24
25//         return maxSum;
26//     }
27// }