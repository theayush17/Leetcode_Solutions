import java.util.*;

public class Q_258 {

    // Solution
    public int addDigits(int num) {

        while (num >= 10) {

            int sum = 0;

            while (num > 0) {

                // Get the last digit
                int digit = num % 10;

                // Add the digit
                sum += digit;

                // Remove the last digit
                num = num / 10;
            }

            // Use the digit sum for the next round
            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int num = sc.nextInt();

        // Create object
        Q_258 obj = new Q_258();

        // Call method
        int answer = obj.addDigits(num);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}