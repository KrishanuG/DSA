// Last updated: 4/14/2026, 2:03:50 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = 0;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != 0) {
6                // swap nums[i] and nums[j]
7                int temp = nums[i];
8                nums[i] = nums[j];
9                nums[j] = temp;
10                j++;
11            }
12        }
13    }
14}