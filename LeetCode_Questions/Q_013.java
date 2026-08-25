import java.util.*;

public class Q_013 {

    // Solution
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            // Check if there is a next character
            if (i + 1 < s.length()) {

                int next = value(s.charAt(i + 1));

                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }

            } else {
                // Last character
                total += current;
            }
        }

        return total;
    }

    // Return the value of a Roman character
    public int value(char ch) {

        switch (ch) {

            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.next();

        // Create object
        Q_013 obj = new Q_013();

        // Call method
        int answer = obj.romanToInt(s);

        // Print answer
        System.out.println("Integer: " + answer);

        sc.close();
    }
}