import java.util.*;

public class Q_2798 {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] hours = new int[n];

        for (int i = 0; i < n; i++) {
            hours[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Q_2798 obj = new Q_2798();

        int answer = obj.numberOfEmployeesWhoMetTarget(hours, target);

        System.out.println(answer);

        sc.close();
    }
}