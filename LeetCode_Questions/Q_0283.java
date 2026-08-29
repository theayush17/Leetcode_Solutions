import java.util.*;

public class Q_0283 {

    // Solution
    public void moveZeroes(int[] nums) {

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with zero
        while (index < nums.length) {
            nums[index] = 0;
            index++;
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

        // Create object
        Q_0283 obj = new Q_0283();

        // Call method
        obj.moveZeroes(nums);

        // Print answer
        System.out.print("Array after moving zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}