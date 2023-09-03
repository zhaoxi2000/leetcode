package lc0350;

import java.util.Arrays;
import java.util.HashMap;

public class Solution01 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        final int m = nums1.length, n = nums2.length;
        final HashMap<Integer, Integer> num_2_cnt =
                new HashMap<>(m); // temp counter for intersection

        for (int i : nums1) {
            int cnt = num_2_cnt.getOrDefault(i, 0) + 1;
            num_2_cnt.put(i, cnt);
        }

        final int[] intersection = new int[m];
        int idx = 0;
        for (int j : nums2) {
            int count = num_2_cnt.getOrDefault(j, 0);

            if (count > 0) {
                intersection[idx++] = j;
                count--;
                if (count <= 0) {
                    num_2_cnt.remove(j);
                } else {
                    num_2_cnt.put(j, count);
                }
            }
        }

        return Arrays.copyOfRange(intersection, 0, idx);
    }
}
