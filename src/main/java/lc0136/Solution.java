package lc0136;

import java.util.Hashtable;

class Solution {
    public int singleNumber(int[] nums) {
        final int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        final Hashtable<Integer, Integer> num_2_cnt = new Hashtable<>(len);
        for (int i = 0; i < len; i++) {
            int preCnt = num_2_cnt.getOrDefault(nums[i], 0);
            int count = preCnt + 1;
            num_2_cnt.put(nums[i], count);
        }


        return num_2_cnt.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
    }
}