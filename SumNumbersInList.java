
import java.util.*;
import java.util.stream.*;

public class SumNumbersInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Sum using streams
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue) // convert to IntStream
                         .sum();

        System.out.println("Sum of numbers = " + sum);
    }
}
