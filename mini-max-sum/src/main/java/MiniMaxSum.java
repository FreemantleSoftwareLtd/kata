import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    private static final int REQUIRED_SIZE = 5;

    public static long[] calculateMiniMaxSum(List<Integer> values) {
        if(values == null || values.isEmpty()){
            throw new IllegalArgumentException("Input list cannot be null or empty");
        }
        if(values.size() != REQUIRED_SIZE){
            throw new IllegalArgumentException("Input list must contain exactly 5 integers");
        }

        // Sorted like this due to Java 15 constraint.
        List<Integer> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList);

        long minSumFromFirstFourNumbers = sortedList.subList(0,4).stream()
                .mapToLong(Integer::longValue)
                .sum();

        long maxSumFromLastFourNumbers = sortedList.subList(1,5).stream()
                .mapToLong(Integer::longValue)
                .sum();


        return new long[]{minSumFromFirstFourNumbers, maxSumFromLastFourNumbers};
    }


    public static void printMiniMaxSum(List<Integer> values) {
        long[] result = calculateMiniMaxSum(values);
        System.out.println(result[0] + " " + result[1]);
    }
 }

