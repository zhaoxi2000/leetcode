package lc0682;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        final List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+": {
                    int size = scores.size();
                    int score = scores.get(size - 1) + scores.get(size - 2);
                    scores.add(score);
                    break;
                }
                case "D": {
                    int size = scores.size();
                    int score = 2 * scores.get(size - 1);
                    scores.add(score);
                    break;
                }
                case "C": {
                    scores.remove(scores.size() - 1);
                    break;
                }
                default: {
                    int score = Integer.parseInt(operations[i]);
                    scores.add(score);
                }
            }
        }

        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}