import java.util.*;

public class Q_069 {

    // Solution
    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        int i = 1;

        while ((long) i * i <= x) {
            i++;
        }

        return i - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int x = sc.nextInt();

        // Create object
        Q_069 obj = new Q_069();

        // Call method
        int answer = obj.mySqrt(x);

        // Print answer
        System.out.println("Square Root: " + answer);

        sc.close();
    }
}