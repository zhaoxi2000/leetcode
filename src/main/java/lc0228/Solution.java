package lc0228;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        final int len = nums.length;
        if (len < 1) {
            return new ArrayList<>();
        }

        final List<String> ans = new ArrayList<>(len);
        int i = 0;
        while (i < len) {
            int low = i;
            i++;

            while (i < len && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;

            if (low == high) {
                ans.add(nums[low] + "");
            } else {
                ans.add(nums[low] + "->" + nums[high]);
            }
        }

        return ans;
    }
}