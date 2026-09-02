import java.util.*;

public class Q_4038 {

    // Solution
    public int countSpecialIntegers(int[] nums) {

        boolean[] seen = new boolean[101];
        boolean[] special = new boolean[101];

        // Initially, every number is considered special
        for (int i = 0; i <= 100; i++) {
            special[i] = true;
        }

        // First element starts its first block
        seen[nums[0]] = true;

        for (int i = 1; i < nums.length; i++) {

            // A new block starts when current != previous
            if (nums[i] != nums[i - 1]) {

                int current = nums[i];

                // If we have already seen this number,
                // it means it is appearing in another block
                if (seen[current]) {
                    special[current] = false;
                } else {
                    seen[current] = true;
                }
            }
        }

        int count = 0;

        // Count distinct numbers that are still special
        for (int i = 1; i <= 100; i++) {

            if (seen[i] && special[i]) {
                count++;
            }
        }

        return count;
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
        Q_4038 obj = new Q_4038();

        // Call method
        int answer = obj.countSpecialIntegers(nums);

        // Print answer
        System.out.println("Number of special integers: " + answer);

        sc.close();
    }
}