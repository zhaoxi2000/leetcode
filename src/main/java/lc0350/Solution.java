package lc0350;

import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        final int[] shortArray;
        final int[] longArray;
        if (nums1.length < nums2.length) {
            shortArray = nums1;
            longArray = nums2;
        } else {
            shortArray = nums2;
            longArray = nums1;
        }

        final int m = shortArray.length;
        final int n = longArray.length;

        Arrays.sort(shortArray);
        Arrays.sort(longArray);

        final int[] intersection = new int[m];
        int i = 0, j = 0, idx = 0;
        while (i < m && j < n) {
            if (shortArray[i] < longArray[j]) {
                i++;
            } else if (shortArray[i] > longArray[j]) {
                j++;
            } else {
                intersection[idx++] = shortArray[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOfRange(intersection, 0, idx);
    }
}