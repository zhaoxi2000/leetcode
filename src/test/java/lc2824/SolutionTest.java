package lc2824;

import lc2824.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{-1, 1, 2, 3, 1}, 2, 3),
                Arguments.of(new int[]{-6, 2, 5, -2, -7, -1, 3}, -2, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void countPairs(int[] nums, int target, int expected) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int n : nums) {
            list.add(n);
        }
        int actual = main.countPairs(list, target);
        assertEquals(expected, actual);
    }
}