package lc0697;

import lc0697.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution solution = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3, 1}, 2),
                Arguments.of(new int[]{1, 2, 2, 3, 1, 4, 2}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void findShortestSubArray(int[] nums, int expected) {
        int actual = solution.findShortestSubArray(nums);
        assertEquals(expected, actual);
    }
}