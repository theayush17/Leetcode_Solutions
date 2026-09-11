import java.util.*;

public class Q_645 {

    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length + 1];

        for (int num : nums) {
            count[num]++;
        }

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Q_645 obj = new Q_645();

        int[] answer = obj.findErrorNums(nums);

        System.out.println(Arrays.toString(answer));

        sc.close();
    }
}