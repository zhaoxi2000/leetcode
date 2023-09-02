package lc0027;

import lc0027.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    final Solution solution = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4})
        );
    }
    @ParameterizedTest
    @MethodSource("data")
    void removeElement(int[] nums, int val, int[] expected) {
        int count = solution.removeElement(nums, val);

        int[] actual = new int[count];
        System.arraycopy(nums, 0, actual, 0, count);
        assertArrayEquals(expected, actual);
    }


}