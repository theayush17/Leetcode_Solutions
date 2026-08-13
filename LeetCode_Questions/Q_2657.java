import java.util.*;

public class Q_2657 {

    public int[] findThePrefixCommonArray(
            int[] A,
            int[] B) {

        int n = A.length;

        int[] ans = new int[n];

        int[] freq = new int[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            freq[A[i]]++;

            if (freq[A[i]] == 2) {
                common++;
            }

            freq[B[i]]++;

            if (freq[B[i]] == 2) {
                common++;
            }

            ans[i] = common;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        Q_2657 q = new Q_2657();

        int[] result =
                q.findThePrefixCommonArray(A, B);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}