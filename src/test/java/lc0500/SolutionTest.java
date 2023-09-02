package lc0500;

import lc0500.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new String[]{"Hello", "Alaska", "Dad", "Peace"},
                        new String[]{"Alaska", "Dad"}),
                Arguments.of(new String[]{"omk"},
                        new String[]{})

        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void findWords(String[] words, String[] expected) {
        String[] actual = main.findWords(words);
        assertArrayEquals(expected, actual);
    }
}