package lc0121;

import lc0121.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void maxProfit(int[] prices, int expected) {
        final int actual = main.maxProfit(prices);
        assertEquals(expected, actual);
    }
}