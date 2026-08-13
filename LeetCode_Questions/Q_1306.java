import java.util.*;

public class Q_1306 {

    public boolean canReach(int[] arr, int start) {

        boolean[] visited = new boolean[arr.length];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        visited[start] = true;

        while (!queue.isEmpty()) {

            int index = queue.poll();

            if (arr[index] == 0) {
                return true;
            }

            int forward = index + arr[index];

            int backward = index - arr[index];

            if (forward < arr.length && !visited[forward]) {

                visited[forward] = true;

                queue.offer(forward);
            }

            if (backward >= 0 && !visited[backward]) {

                visited[backward] = true;

                queue.offer(backward);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = sc.nextInt();

        Q_1306 q = new Q_1306();

        System.out.println(q.canReach(arr, start));

        sc.close();
    }
}