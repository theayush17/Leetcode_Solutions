import java.util.*;

public class Q_2784 {

    public boolean isGood(int[] nums) {

        int n = nums.length;

        int[] freq = new int[n];

        for (int num : nums) {

            if (num <= 0 || num >= n) {
                return false;
            }

            freq[num]++;

            if (num != n - 1 &&
                    freq[num] > 1) {

                return false;
            }

            if (num == n - 1 &&
                    freq[num] > 2) {

                return false;
            }
        }

        for (int i = 1; i <= n - 1; i++) {

            if (i == n - 1) {

                if (freq[i] != 2) {
                    return false;
                }

            } else {

                if (freq[i] != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Q_2784 q = new Q_2784();

        System.out.println(q.isGood(nums));

        sc.close();
    }
}