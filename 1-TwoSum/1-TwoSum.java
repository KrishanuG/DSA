// Last updated: 8/5/2025, 12:37:07 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int val=0;
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            //val = target - nums[i];
            for(int j =i+1 ;j<nums.length;j++)
                if(nums[i]+nums[j]==target){
                    res[0] =i;
                    res[1]=j;
                }
        }
        return res;
    }
    
}