package lc0118;

import lc0118.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    final Solution solution = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void generate() {
    }
}