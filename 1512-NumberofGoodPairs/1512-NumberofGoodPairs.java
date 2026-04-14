// Last updated: 4/14/2026, 1:01:32 PM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        HashMap<Integer, Integer> freq = new HashMap<>();
4        int count = 0; // count the pair formed
5        // [1,2,3,1,1,3]
6        for (int num : nums) {
7            count = count + freq.getOrDefault(num, 0);
8            freq.put(num, freq.getOrDefault(num, 0) + 1);// e.g.- {1:1, 2:1}
9        }
10
11        return count;
12    }
13}