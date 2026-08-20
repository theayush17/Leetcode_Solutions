import java.util.*;

public class Q_027 {

    // Solution
    public int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[count] = nums[i];
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

        int val = sc.nextInt();

        // Create object
        Q_027 obj = new Q_027();

        // Call method
        int k = obj.removeElement(nums, val);

        // Print answer
        System.out.println("Number of remaining elements: " + k);

        System.out.print("Array after removing " + val + ": ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}