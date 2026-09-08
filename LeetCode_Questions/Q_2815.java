import java.util.*;

public class Q_2815 {

    public int maxSum(int[] nums) {
        int[] maxDigit = new int[10];
        Arrays.fill(maxDigit, -1);

        int answer = -1;

        for (int num : nums) {
            int max = 0;
            int temp = num;

            while (temp > 0) {
                max = Math.max(max, temp % 10);
                temp /= 10;
            }

            if (maxDigit[max] != -1) {
                answer = Math.max(answer, num + maxDigit[max]);
            }

            maxDigit[max] = Math.max(maxDigit[max], num);
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

        Q_2815 obj = new Q_2815();

        int answer = obj.maxSum(nums);

        System.out.println(answer);

        sc.close();
    }
}