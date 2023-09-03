package lc0414;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int thirdMax(int[] nums) {
        final int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        Arrays.sort(nums);

        final Deque<Integer> ans = new ArrayDeque<>(3);
        for (int j = len - 1; j >= 0; j--) {
            if (ans.size() >= 3) {
                break;
            }
            if (!ans.isEmpty()) {
                int top = ans.peek();
                if (nums[j] < top) {
                    ans.push(nums[j]);
                }
            } else {
                ans.push(nums[j]);
            }
        }

        if (ans.size() == 3) {
            return ans.poll();
        } else {
            return ans.pollLast();
        }
    }
}