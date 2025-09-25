// For L1 local small data lookup → prefer for loop (less overhead).
//For business logic with transformations → prefer Streams (clean & future-proof).
For business logic with transformations → prefer Streams (clean & future-proof).
import java.util.*;
import java.util.stream.*;

public class LoopVsStreamBenchmark {
    public static void main(String[] args) {
        // Prepare data (1 million integers)
        List<Integer> data = IntStream.rangeClosed(1, 1_000_000)
                                      .boxed()
                                      .collect(Collectors.toList());
        int target = 500_000;

        // ---------- For loop with break ----------
        long start = System.nanoTime();
        Integer foundLoop = null;
        for (Integer num : data) {
            if (num == target) {
                foundLoop = num;
                break;
            }
        }
        long end = System.nanoTime();
        long loopTime = end - start;

        // ---------- Stream findFirst ----------
        start = System.nanoTime();
        Integer foundStream = data.stream()
                                  .filter(num -> num == target)
                                  .findFirst()
                                  .orElse(null);
        end = System.nanoTime();
        long streamTime = end - start;

        // ---------- Results ----------
        System.out.println("For loop found: " + foundLoop + " in " + loopTime / 1_000_000.0 + " ms");
        System.out.println("Stream found   : " + foundStream + " in " + streamTime / 1_000_000.0 + " ms");
    }
}
