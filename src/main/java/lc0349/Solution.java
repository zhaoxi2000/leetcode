package lc0349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashSet<Integer> inter = new HashSet<>(nums1.length);
        for (int n : nums1) {
            int idx = Arrays.binarySearch(nums2, n);
            if (idx >= 0) {
                inter.add(n);
            }
        }

        int cnt = 0;
        int[] ans = new int[inter.size()];
        for (Integer integer : inter) {
            ans[cnt++] = integer;
        }


        return ans;
    }
}