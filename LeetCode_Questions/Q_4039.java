import java.util.*;

public class Q_4039 {

    static final long MOD = 1000000007L;

    // Solution
    public int decodeSum(int[] nums) {

        long total = 0;

        for (int num : nums) {

            // Find width
            int width = num % 10;

            // Remove width from the end
            long d = num / 10;

            // Find number of digits in d
            int digits = String.valueOf(d).length();

            // Find divisor to separate x and y
            long divisor = 1;

            for (int i = 0; i < digits - width; i++) {
                divisor *= 10;
            }

            // Find x and y
            long x = d / divisor;
            long y = d % divisor;

            // Calculate x^y
            long value = power(x, y);

            // Add to answer
            total = (total + value) % MOD;
        }

        return (int) total;
    }

    // Calculate x^y % MOD
    public long power(long x, long y) {

        long result = 1;

        x = x % MOD;

        while (y > 0) {

            // If y is odd
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }

            // Square x
            x = (x * x) % MOD;

            // Divide y by 2
            y = y / 2;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object
        Q_4039 obj = new Q_4039();

        // Call method
        int answer = obj.decodeSum(nums);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}