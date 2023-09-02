package lc0697;

import java.util.HashMap;

class Solution {
    public int findShortestSubArray(int[] nums) {
        final HashMap<Integer, Integer> num_2_cnt = new HashMap<>();
        final HashMap<Integer, Integer> num_2_firstIdx = new HashMap<>();
        int maxDegree = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int prevCount = num_2_cnt.getOrDefault(nums[i], 0);
            int count = prevCount + 1;

            num_2_cnt.put(nums[i], count);

            if (!num_2_firstIdx.containsKey(nums[i])) {
                num_2_firstIdx.put(nums[i], i);
            }

            final int degree = num_2_cnt.get(nums[i]);

            if (degree > maxDegree) {
                maxDegree = degree;
                ans = i - num_2_firstIdx.get(nums[i]) + 1;
            } else if (degree == maxDegree) {
                ans = Math.min(ans, i - num_2_firstIdx.get(nums[i]) + 1);
            }
        }

        return ans;
    }
}