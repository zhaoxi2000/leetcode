package lc0066;

class Solution {
    public int[] plusOne(int[] digits) {
        final int len = digits.length;

        // +1 : true
        boolean more = true;
        for (int k = len - 1; k >= 0; k--) {
            if (more) {
                if (digits[k] + 1 <= 9) {
                    more = false;
                } else {
                    more = true;
                }
            } else {
                break;
            }
        }
        if (more) {
            final int[] ans = new int[len + 1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, len);
            return ans;
        }
        return digits;
    }
}