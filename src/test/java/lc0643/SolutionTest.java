package lc0643;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    final Solution main = new Solution();


    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75D)

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void findMaxAverage(int[] nums, int k, double expected) {
        double actual = main.findMaxAverage(nums, k);
        assertTrue(Math.abs(actual - expected) <= 0.00001);
    }
}