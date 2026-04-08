// Last updated: 4/8/2026, 4:39:33 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int minNum = nums[0];
4        int maxNum = nums[0];
5        int result = nums[0];
6        for (int i = 1; i < nums.length; i++) {
7           /* If the current element is negative, swap max and min
8            (because multiplying by a negative flips signs). */
9
10           if(nums[i]<0){
11            int temp = maxNum;
12            maxNum = minNum;
13            minNum = temp;
14           }
15           maxNum = Math.max(nums[i], nums[i]*maxNum);
16           minNum = Math.min(nums[i], nums[i]*minNum);
17           result = Math.max(result, maxNum);
18        }
19        return result;
20    }
21}