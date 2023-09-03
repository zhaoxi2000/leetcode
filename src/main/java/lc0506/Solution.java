package lc0506;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        final int len = score.length;
        if (len < 1) {
            return new String[0];
        }

        final Integer[] orders = new Integer[len];
        int j = 0;
        for (int s : score) {
            orders[j++] = s;
        }
        Arrays.sort(orders, Collections.reverseOrder());

        HashMap<Integer, String> score_2_rank = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            final String rank;
            switch (i) {
                case 0: {
                    rank = "Gold Medal";
                    break;
                }
                case 1: {
                    rank = "Silver Medal";
                    break;
                }
                case 2: {
                    rank = "Bronze Medal";
                    break;
                }
                default: {
                    rank = (i + 1) + "";
                }
            }
            score_2_rank.put(orders[i], rank);
        }

        final String[] ans = new String[len];
        int i = 0;
        for (int n : score) {
            ans[i++] = score_2_rank.get(n);
        }
        return ans;
    }
}