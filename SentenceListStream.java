
import java.util.*;
import java.util.stream.*;

public class SentenceListStream {
    public static void main(String[] args) {
        String text = "Java is powerful. Streams make code clean. Practice improves skills.";

        // Split into sentences, trim, and collect into a list
        List<String> sentences = Arrays.stream(text.split("\\."))
                .map(String::trim)          // remove extra spaces
                .filter(s -> !s.isEmpty())  // remove empty entries
                .collect(Collectors.toList());

        // Count sentences
        long count = sentences.size();

        // Print results
        System.out.println("Sentences: " + sentences);
        System.out.println("Number of sentences: " + count);
    }
}
