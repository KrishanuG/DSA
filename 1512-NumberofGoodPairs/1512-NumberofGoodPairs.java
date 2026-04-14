// Last updated: 4/14/2026, 1:10:11 PM
class Solution {
    public int numIdenticalPairs(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a: A) {
            ans += cnt[a]++;
        }
        return ans;     
    }
}