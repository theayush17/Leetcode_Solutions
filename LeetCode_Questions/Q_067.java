import java.util.*;

public class Q_067 {

    // Solution
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            // Add digit from a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add digit from b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Current binary digit
            result.append(sum % 2);

            // Calculate carry
            carry = sum / 2;
        }

        // We built the answer backwards
        return result.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String a = sc.next();
        String b = sc.next();

        // Create object
        Q_067 obj = new Q_067();

        // Call method
        String answer = obj.addBinary(a, b);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}