import java.util.*;

public class Q_2770 {

    public int maximumJumps(int[] nums, int target) {

        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] != -1 &&
                        Math.abs(nums[i] - nums[j]) <= target) {

                    dp[i] = Math.max(
                            dp[i],
                            dp[j] + 1
                    );
                }
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Q_2770 q = new Q_2770();

        System.out.println(
                q.maximumJumps(nums, target)
        );

        sc.close();
    }
}