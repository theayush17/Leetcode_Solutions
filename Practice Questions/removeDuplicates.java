import java.util.*;

public class removeDuplicates {

    // Solution
    public static int removeDup(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {

                i++;

                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the sorted array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method
        int k = removeDup(nums);

        // Print answer
        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}