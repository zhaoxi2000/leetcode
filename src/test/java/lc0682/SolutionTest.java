package lc0682;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new String[]{"5", "2", "C", "D", "+"}, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void calPoints(String[] ops, int expected) {
        int actual = main.calPoints(ops);
        assertEquals(expected, actual);
    }
}