package lc0506;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 3, 2, 1},
                        new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"})


        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void findRelativeRanks(int[] score, String[] expected) {
        String[] actual = main.findRelativeRanks(score);
        assertArrayEquals(expected, actual);
    }
}