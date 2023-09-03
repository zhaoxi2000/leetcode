package lc0414;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void thirdMax(int[] nums, int expected) {
        int actual = main.thirdMax(nums);
        assertEquals(expected, actual);
    }
}