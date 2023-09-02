package lc0561;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        final int len = nums.length;
        if (len % 2 != 0) {
            return 0;
        }

        Arrays.sort(nums);

        int ans = 0;
        for (int i = 0; i < len; i = i + 2) {
            int min = Math.min(nums[i], nums[i + 1]);
            ans += min;
        }

        return ans;
    }
}