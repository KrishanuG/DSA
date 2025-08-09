// Last updated: 8/9/2025, 1:33:20 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int read1 = m - 1; // Tracks last valid element in nums1
        int read2 = n - 1; // Tracks last element in nums2
        int write = m + n - 1; // Tracks position to write merged element

        while (write >= 0) {
            if (read1 >= 0 && read2 >= 0) { // Both arrays still have elements
                if (nums1[read1] >= nums2[read2]) {
                    nums1[write] = nums1[read1];
                    read1--;
                } else {
                    nums1[write] = nums2[read2];
                    read2--;
                }
            } else if (read1 >= 0) { // nums2 finished, only nums1 left
                nums1[write] = nums1[read1];
                read1--;
            } else { // nums1 finished, only nums2 left
                nums1[write] = nums2[read2];
                read2--;
            }
            write--; // Move to next position from the back
        }
    }
}
