//
import java.util.*;
import java.util.stream.*;

public class LongestStringInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Programming", "Stream", "API", "Examples");

        // Find the longest string using streams
        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null); // in case list is empty

        System.out.println("Longest string = " + longest);
    }
}
