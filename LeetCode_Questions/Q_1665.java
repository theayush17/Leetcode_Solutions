import java.util.*;

public class Q_1665 {

    public int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks, (a, b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });

        int currentEnergy = 0;
        int answer = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            if (currentEnergy < minimum) {

                answer += minimum - currentEnergy;

                currentEnergy = minimum;
            }

            currentEnergy -= actual;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] tasks = new int[n][2];

        for (int i = 0; i < n; i++) {

            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
        }

        Q_1665 q = new Q_1665();

        System.out.println(q.minimumEffort(tasks));

        sc.close();
    }
}