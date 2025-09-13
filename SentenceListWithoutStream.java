
import java.util.*;

public class SentenceListWithoutStream {
    public static void main(String[] args) {
        String text = "Java is powerful. Streams make code clean. Practice improves skills.";

        // Split into sentences
        String[] parts = text.split("\\.");

        List<String> sentences = new ArrayList<>();

        for (String part : parts) {
            String trimmed = part.trim();
            if (!trimmed.isEmpty()) {
                sentences.add(trimmed);
            }
        }

        // Count sentences
        int count = sentences.size();

        // Print results
        System.out.println("Sentences: " + sentences);
        System.out.println("Number of sentences: " + count);
    }
}
