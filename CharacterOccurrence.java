//CharacterOccurrence
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "programming";

        // Count character occurrences using streams
        Map<Character, Long> charCount = input.chars()   // IntStream of characters
                .mapToObj(c -> (char) c)                // Convert int to Character
                .collect(Collectors.groupingBy(
                        Function.identity(),            // Group by character itself
                        Collectors.counting()           // Count occurrences
                ));

        // Print result
        charCount.forEach((ch, count) ->
                System.out.println(ch + " : " + count));
    }
}
