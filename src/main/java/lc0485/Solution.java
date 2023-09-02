package lc0485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        final int len = nums.length;
        int max = 0;

        int count = 0;
        for(int i = 0 ; i < len ; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }

        return max;
    }
}