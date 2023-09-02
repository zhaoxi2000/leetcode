package lc0283;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void moveZeroes(int[] nums, int[] expected) {
        main.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}