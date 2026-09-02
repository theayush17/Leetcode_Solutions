import java.util.*;

public class Q_4040 {

    public int minOperations(int[] nums, int sum) {

        int INF = 1000000;

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int num : nums) {

            int[] values = new int[30];
            int[] costs = new int[30];
            int count = 0;

            int value = num;
            int cost = 0;

            while (value <= sum) {
                values[count] = value;
                costs[count] = cost;
                count++;

                if (value > sum / 2) {
                    break;
                }

                value *= 2;
                cost++;
            }

            value = num;
            cost = 0;

            while (value > 1) {
                value /= 2;
                cost++;

                if (value <= sum) {
                    values[count] = value;
                    costs[count] = cost;
                    count++;
                }
            }

            int[] newDp = dp.clone();

            for (int current = 0; current <= sum; current++) {

                if (dp[current] == INF) {
                    continue;
                }

                for (int i = 0; i < count; i++) {

                    int newValue = values[i];

                    if (current + newValue <= sum) {
                        newDp[current + newValue] = Math.min(
                                newDp[current + newValue],
                                dp[current] + costs[i]
                        );
                    }
                }
            }

            dp = newDp;
        }

        return dp[sum] == INF ? -1 : dp[sum];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        Q_4040 obj = new Q_4040();

        int answer = obj.minOperations(nums, sum);

        System.out.println(answer);

        sc.close();
    }
}