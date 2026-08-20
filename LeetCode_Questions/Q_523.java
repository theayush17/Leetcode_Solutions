import java.util.*;

public class Q_523 {

    // Solution
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 exists before the array starts
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int remainder = prefixSum % k;

            // If this remainder was seen before
            if (map.containsKey(remainder)) {

                int previousIndex = map.get(remainder);

                // Subarray length must be at least 2
                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {

                // Store only the first occurrence
                map.put(remainder, i);
            }
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

        int k = sc.nextInt();

        // Create object
        Q_523 obj = new Q_523();

        // Call method
        boolean answer = obj.checkSubarraySum(nums, k);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}