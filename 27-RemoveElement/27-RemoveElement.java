// Last updated: 8/5/2025, 12:36:44 PM
// Using fast-slow pointer approach
class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0; //pointer to iterate through every element
        int slow = 0; // track the position where the next valid element should go
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
