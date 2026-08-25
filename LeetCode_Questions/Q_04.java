import java.util.*;

public class Q_04 {

    // Solution
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays
        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Add remaining elements of nums1
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        // Add remaining elements of nums2
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        // Find median
        int length = merged.length;

        if (length % 2 == 1) {

            // Odd number of elements
            return merged[length / 2];

        } else {

            // Even number of elements
            int middle1 = merged[length / 2 - 1];
            int middle2 = merged[length / 2];

            return (middle1 + middle2) / 2.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Create object
        Q_04 obj = new Q_04();

        // Call method
        double answer = obj.findMedianSortedArrays(nums1, nums2);

        // Print answer
        System.out.println("Median: " + answer);

        sc.close();
    }
}