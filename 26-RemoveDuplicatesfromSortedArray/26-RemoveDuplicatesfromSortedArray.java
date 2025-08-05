// Last updated: 8/5/2025, 11:38:17 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        for (int end = 1; end < nums.length; end++) {
            if(nums[start]!= nums[end]){
                start+=1;
                nums[start] = nums[end];
            }
        }
        return start+1;
    }
}
