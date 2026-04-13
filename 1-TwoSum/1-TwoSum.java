// Last updated: 4/13/2026, 5:55:08 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer, Integer> numMap = new HashMap<>();
4
5        for(int i = 0; i<nums.length; i++){
6            int complement = target - nums[i];
7            if(numMap.containsKey(complement)){
8                return new int[]{numMap.get(complement), i};
9            }
10            numMap.put(nums[i], i);
11        }
12        return new int[]{};
13    }
14}