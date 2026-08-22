import java.util.*;

public class Q_070 {

    // Solution
    public int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {

            int current = first + second;

            first = second;
            second = current;
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        // Create object
        Q_070 obj = new Q_070();

        // Call method
        int answer = obj.climbStairs(n);

        // Print answer
        System.out.println("Number of ways: " + answer);

        sc.close();
    }
}