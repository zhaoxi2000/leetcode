package lc0219;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1, 2, 3}, 2, false),
                Arguments.of(new int[]{1, 0, 1, 1}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void containsNearbyDuplicate(int[] nums, int k, boolean expected) {
        boolean actual = main.containsNearbyDuplicate(nums, k);
        assertEquals(expected, actual);
    }
}