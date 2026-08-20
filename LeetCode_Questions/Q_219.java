import java.util.*;

public class Q_219 {

    // Solution
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Check if the number was seen before
            if (map.containsKey(num)) {

                int previousIndex = map.get(num);

                // Check the distance between the two indices
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Store/update the latest index
            map.put(num, i);
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
        Q_219 obj = new Q_219();

        // Call method
        boolean answer = obj.containsNearbyDuplicate(nums, k);

        // Print answer
        System.out.println("Answer: " + answer);

        sc.close();
    }
}