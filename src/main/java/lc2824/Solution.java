package lc2824;

import java.util.Collections;
import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        final int size = nums.size();
        Collections.sort(nums);

        int count = 0;
        for (int left = 0, right = size - 1; left < right; ) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }

        }


        return count;
    }
}