
import java.util.*;

public class LongestStringWithoutStream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Programming", "Stream", "API", "Examples");

        String longest = null;
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longest = word;
            }
        }

        System.out.println("Longest string = " + longest);
    }
}
