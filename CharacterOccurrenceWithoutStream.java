//CharacterOccurrenceWithoutStream
import java.util.*;

public class CharacterOccurrenceWithoutStream {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences manually
        for (char ch : input.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }

        // Print result
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
