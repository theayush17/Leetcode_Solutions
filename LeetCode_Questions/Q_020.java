import java.util.*;

public class Q_020 {

    // Solution
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);

            } else {

                // If there is no opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching brackets
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        // Valid only if no opening brackets are left
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.next();

        // Create object
        Q_020 obj = new Q_020();

        // Call method
        boolean answer = obj.isValid(s);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}