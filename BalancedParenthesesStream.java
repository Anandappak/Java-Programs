
import java.util.*;

public class BalancedParenthesesStream {
    private static final Map<Character, Character> brackets = Map.of(
        ')', '(',
        '}', '{',
        ']', '['
    );

    public static boolean isBalanced(String str) {
        // Use a stack to maintain state
        Deque<Character> stack = new ArrayDeque<>();

        str.chars()
           .mapToObj(c -> (char) c)
           .forEach(ch -> {
               if (brackets.containsValue(ch)) {
                   // Opening bracket -> push
                   stack.push(ch);
               } else if (brackets.containsKey(ch)) {
                   // Closing bracket -> check stack
                   if (stack.isEmpty() || !stack.pop().equals(brackets.get(ch))) {
                       // To break stream early (not ideal), throw runtime exception
                       throw new RuntimeException("Unbalanced");
                   }
               }
           });

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        List<String> tests = Arrays.asList("{[()]}", "{[(])}", "((()))", "(()");

        tests.forEach(s -> {
            try {
                System.out.println(s + " -> " + isBalanced(s));
            } catch (RuntimeException e) {
                System.out.println(s + " -> false");
            }
        });
    }
}
