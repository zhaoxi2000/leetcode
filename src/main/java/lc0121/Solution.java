package lc0121;

class Solution {
    public int maxProfit(int[] prices) {
        final int len = prices.length;
        if (len <= 1) {
            return 0;
        }

        int profit = 0;
        int lower = prices[0], higher = prices[0];
        for (int i = 1; i < len; i++) {
            final int p = prices[i];
            if (p < lower) {
                lower = p;
                higher = p;
            } else if (p > lower && p > higher) {
                higher = p;
            }

            profit = Math.max(profit, higher - lower);
        }


        return profit;
    }
}