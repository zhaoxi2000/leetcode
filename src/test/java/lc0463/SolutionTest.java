package lc0463;

import lc0463.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[][]{{1}}, 4),
                Arguments.of(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void islandPerimeter(int[][] grid, int expected) {

        int actual = main.islandPerimeter(grid);
        Assertions.assertEquals(expected, actual);
    }
}