package com.freemantlesoftware;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {


    public int countTallestCandles(List<Integer> candles) {
        if (candles == null || candles.isEmpty()) {
            return 0;
        }

        int maxHeight = Collections.max(candles);
        return Collections.frequency(candles, maxHeight);
    }


}
