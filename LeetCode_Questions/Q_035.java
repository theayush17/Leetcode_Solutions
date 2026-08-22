import java.util.*;

public class Q_035 {

    // Solution
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // Create object
        Q_035 obj = new Q_035();

        // Call method
        int answer = obj.searchInsert(nums, target);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}
