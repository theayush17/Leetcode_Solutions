import java.util.*;

public class Q_2540 {

    public int getCommon(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        while (i < nums1.length &&
                j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }

            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] nums2 = new int[m];

        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        Q_2540 q = new Q_2540();

        System.out.println(q.getCommon(nums1, nums2));

        sc.close();
    }
}