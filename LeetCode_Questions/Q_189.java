import java.util.*;

public class Q_189 {

    // Solution
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // If k is greater than n
        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int newIndex = (i + k) % n;

            result[newIndex] = nums[i];
        }

        // Copy result back into nums
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Create object
        Q_189 obj = new Q_189();

        // Call method
        obj.rotate(nums, k);

        // Print answer
        System.out.print("Rotated Array: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}