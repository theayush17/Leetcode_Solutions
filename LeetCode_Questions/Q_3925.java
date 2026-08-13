import java.util.Arrays;
import java.util.Scanner;

public class Q_3925 {

    // Reverse number and concatenate
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[n - i - 1];
        }

        return ans;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Q_3925 q = new Q_3925();

        System.out.println(Arrays.toString(q.concatWithReverse(arr)));

        sc.close();
    }
}