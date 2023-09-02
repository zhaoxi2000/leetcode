package lc0283;

class Solution {
    public void moveZeroes(int[] nums) {
        final int len = nums.length;
        if (len <= 1) {
            return;
        }

        int fast = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[fast++] = n;
            }
        }

        for (int i = fast; i < len; i++) {
            nums[i] = 0;
        }

    }
}