package lc0643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        final int len = nums.length;
        if (len < 1) {
            return 0;
        }

        // first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int j = k; j < len; j++) {
            sum = sum - nums[j - k] + nums[j];
            maxSum = Math.max(sum, maxSum);
        }

        return (1.0 * maxSum) / k;
    }
}