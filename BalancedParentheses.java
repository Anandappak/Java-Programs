
import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched bracket
                }
            }
        }

        // Balanced if no unmatched opening remains
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";   // Balanced
        String test2 = "{[(])}";   // Not Balanced
        String test3 = "((()))";   // Balanced
        String test4 = "(()";      // Not Balanced

        System.out.println(test1 + " -> " + isBalanced(test1));
        System.out.println(test2 + " -> " + isBalanced(test2));
        System.out.println(test3 + " -> " + isBalanced(test3));
        System.out.println(test4 + " -> " + isBalanced(test4));
    }
}
