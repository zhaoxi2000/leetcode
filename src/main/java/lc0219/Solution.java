package lc0219;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 不可以排序.
        final int len = nums.length;
        final int end = len - 1;
        int i = 0;
        while (i < len) {

            int j = Math.min(i + k, end);
            while (i < j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j--;
            }

            i++;
        }

        return false;
    }
}