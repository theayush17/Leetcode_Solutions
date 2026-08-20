import java.util.*;

public class Q_066 {

    // Solution
    public int[] plusOne(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9,
            // simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0
            digits[i] = 0;
        }

        // If we reach here, all digits were 9
        int[] result = new int[digits.length + 1];

        // First digit is 1
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Create object
        Q_066 obj = new Q_066();

        // Call method
        int[] answer = obj.plusOne(digits);

        // Print answer
        System.out.print("Answer: ");

        for (int digit : answer) {
            System.out.print(digit + " ");
        }

        sc.close();
    }
}