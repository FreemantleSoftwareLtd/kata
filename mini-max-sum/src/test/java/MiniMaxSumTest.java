import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {

    @Test
    void testCalculateMiniMaxSum_1() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        long[] result = MiniMaxSum.calculateMiniMaxSum(input);
        assertArrayEquals(new long[]{10, 14}, result);
    }

    @Test
    void testCalculateMiniMaxSum_2() {
        List<Integer> input = List.of(100000, 200000, 300000, 400000, 500000);
        long[] result = MiniMaxSum.calculateMiniMaxSum(input);
        assertArrayEquals(new long[]{1000000, 1400000}, result);
    }

    @Test
    void testCalculateMiniMaxSum_3() {
        List<Integer> input = List.of(-1, -2, -3, -4, -5);
        long[] result = MiniMaxSum.calculateMiniMaxSum(input);
        assertArrayEquals(new long[]{-14, -10}, result);
    }

    @Test
    void testCalculateMiniMaxSum_4() {
        List<Integer> input = List.of(1, 3, 5, 7, 9);
        long[] result = MiniMaxSum.calculateMiniMaxSum(input);
        assertArrayEquals(new long[]{16, 24}, result);
    }

    @Test
    void testCalculateMiniMaxSum_AllOnes() {
        List<Integer> input = List.of(1, 1, 1, 1, 1);
        long[] result = MiniMaxSum.calculateMiniMaxSum(input);
        assertArrayEquals(new long[]{4, 4}, result);
    }

    @Test
    void testCalculateMiniMaxSumWithNullInput() {
        assertThrows(IllegalArgumentException.class, () -> MiniMaxSum.calculateMiniMaxSum(null));
    }

    @Test
    void testCalculateMiniMaxSumWithEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> MiniMaxSum.calculateMiniMaxSum(new ArrayList<>()));
    }

    @Test
    void testCalculateMiniMaxSumWithInvalidSizeInput() {
        assertThrows(IllegalArgumentException.class, () -> MiniMaxSum.calculateMiniMaxSum(List.of(1, 2, 3)));
        assertThrows(IllegalArgumentException.class, () -> MiniMaxSum.calculateMiniMaxSum(List.of(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void testPrintCalculateMiniMaxSum() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        MiniMaxSum.printMiniMaxSum(input);
        // This test is just to ensure that the method runs without exceptions.
        // Output verification is not done here as it would require capturing stdout.
    }

}