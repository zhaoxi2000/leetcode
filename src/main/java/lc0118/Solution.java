package lc0118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> ans = new ArrayList<>(numRows);
        final List<Integer> _01 = new ArrayList<>(1);
        _01.add(1);
        ans.add(_01);

        for (int k = 1; k < numRows; k++) {
            final int len = k + 1;
            final List<Integer> prevPas = ans.get(k - 1);
            final List<Integer> pascals = new ArrayList<>(len);
            // pascals rules
            for (int i = 0; i < len; i++) {
                int prev = i - 1;
                int next = i;

                Integer sum = null;
                if (prev < 0) {
                    sum = prevPas.get(next);
                } else if (next < prevPas.size()) {
                    sum = prevPas.get(prev) + prevPas.get(next);
                } else {
                    sum = prevPas.get(prev);
                }
                pascals.add(sum);
            }
            ans.add(pascals);
        }
        return ans;
    }
}