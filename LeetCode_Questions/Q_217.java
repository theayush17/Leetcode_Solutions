import java.util.*;

public class Q_217 {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
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
        Q_217 obj = new Q_217();

        // Call method
        boolean answer = obj.containsDuplicate(nums);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}