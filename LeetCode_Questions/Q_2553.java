import java.util.*;

public class Q_2553 {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {

            String s = String.valueOf(num);

            for (char c : s.toCharArray()) {
                list.add(c - '0');
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Q_2553 q = new Q_2553();

        int[] result = q.separateDigits(nums);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}