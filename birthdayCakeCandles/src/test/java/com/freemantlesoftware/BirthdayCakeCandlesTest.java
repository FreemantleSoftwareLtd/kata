package com.freemantlesoftware;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BirthdayCakeCandlesTest {

    @Test
    void testCountTallestCandles() {
        BirthdayCakeCandles birthdayCakeCandles = new BirthdayCakeCandles();

        // Test with a normal case
        List<Integer> candles = List.of(3, 2, 1, 3);
        assertEquals(2, birthdayCakeCandles.countTallestCandles(candles));

        // Test with all candles of the same height
        candles = List.of(4, 4, 4, 4);
        assertEquals(4, birthdayCakeCandles.countTallestCandles(candles));
    }

    @Test
    void testEmptyList() {
        BirthdayCakeCandles birthdayCakeCandles = new BirthdayCakeCandles();

        // Test with an empty list
        List<Integer> candles = List.of();
        assertEquals(0, birthdayCakeCandles.countTallestCandles(candles));

        // Test with null input
        assertEquals(0, birthdayCakeCandles.countTallestCandles(null));
    }

}