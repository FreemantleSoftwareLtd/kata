Decision Log: Mini-Max Sum
--------------------------

Suggested Approach: 
- Sort the array of integers, first x (in this case 4) are the smallest and last x are the largest.
- Find x (in this case 4) minimum numbers and some those to give min-sum
- Find x (in this case 4) maximum numbers and sum those to give max-sum.


Input:
Given array of five integers.


Output:
No value should be returned.
Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 elements.

Method Signature:
```java
public void miniMaxSum(long[] integers);

```

Note that hacker rank requires Java version 15, so this makes Java coding not a clean as it would other wise be.
'.Sort' is not available on Streams and Lists.

