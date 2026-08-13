import java.util.*;

public class Q_1674 {

    public int minMoves(int[] nums, int limit) {

        int n = nums.length;

        int[] changes = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {

            int a = nums[i];
            int b = nums[n - 1 - i];

            int low = Math.min(a, b);
            int high = Math.max(a, b);

            int sum = a + b;

            changes[2] += 2;
            changes[2 * limit + 1] -= 2;

            changes[low + 1]--;

            changes[high + limit + 1]++;

            changes[sum]--;

            changes[sum + 1]++;
        }

        int moves = 0;

        int answer = Integer.MAX_VALUE;

        for (int sum = 2; sum <= 2 * limit; sum++) {

            moves += changes[sum];

            answer = Math.min(answer, moves);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int limit = sc.nextInt();

        Q_1674 q = new Q_1674();

        System.out.println(q.minMoves(nums, limit));

        sc.close();
    }
}