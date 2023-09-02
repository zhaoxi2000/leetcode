package lc0561;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    final Solution main = new Solution();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1,4,3,2}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void arrayPairSum(int[] nums, int expected) {
        int actual = main.arrayPairSum(nums);
        assertEquals(expected, actual);
    }
}