package lc0228;

import lc0228.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, new String[]{"0->2", "4->5", "7"}),
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, new String[]{"0", "2->4", "6", "8->9"})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void summaryRanges(int[] nums, String... ranges) {
        final List<String> expected = Arrays.stream(ranges).toList();
        final List<String> actual = main.summaryRanges(nums);
        assertIterableEquals(expected, actual);
    }
}