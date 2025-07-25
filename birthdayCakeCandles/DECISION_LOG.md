Decision Log
================


Suggested Solution:

Sort by value decsending order and take the first element and count how many times it appears in the list.

Suggested method interface:

```java
public int countTallestCandles(List<Integer> candles) {
    if (candles == null || candles.isEmpty()) {
        return 0;
    }
    
    int maxHeight = Collections.max(candles);
    return Collections.frequency(candles, maxHeight);
}
```