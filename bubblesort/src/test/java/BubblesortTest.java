import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubblesortTest {

    @Test
    void testBubbleSort() {
        Bubblesort<Integer> bubblesort = new Bubblesort<>();
        List<Integer> unsortedList = List.of(64, 34, 25, 12, 22, 11, 90);
        List<Integer> result = bubblesort.sort(unsortedList);
        assertEquals(List.of(11, 12, 22, 25, 34, 64, 90), result);
    }

    @Test
    void testBubbleSortWithEmptyList() {
        Bubblesort<Integer> bubblesort = new Bubblesort<>();
        assertThrows(IllegalArgumentException.class, () -> bubblesort.sort(List.of()));
    }

}