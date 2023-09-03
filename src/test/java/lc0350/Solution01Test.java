package lc0350;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution01Test {
    final Solution01 main = new Solution01();

    protected static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void intersect(int[] nums1, int[] nums2, int[] expected) {
        int[] actual = main.intersect(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}