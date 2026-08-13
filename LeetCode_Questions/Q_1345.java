import java.util.*;

public class Q_1345 {

    public int minJumps(int[] arr) {

        int n = arr.length;

        if (n == 1) {
            return 0;
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.computeIfAbsent(
                    arr[i],
                    k -> new ArrayList<>()
            ).add(i);
        }

        boolean[] visited = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);

        visited[0] = true;

        int jumps = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int index = queue.poll();

                if (index == n - 1) {
                    return jumps;
                }

                if (index - 1 >= 0 &&
                        !visited[index - 1]) {

                    visited[index - 1] = true;

                    queue.offer(index - 1);
                }

                if (index + 1 < n &&
                        !visited[index + 1]) {

                    visited[index + 1] = true;

                    queue.offer(index + 1);
                }

                List<Integer> sameValue =
                        map.get(arr[index]);

                if (sameValue != null) {

                    for (int next : sameValue) {

                        if (!visited[next]) {

                            visited[next] = true;

                            queue.offer(next);
                        }
                    }

                    sameValue.clear();
                }
            }

            jumps++;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Q_1345 q = new Q_1345();

        System.out.println(q.minJumps(arr));

        sc.close();
    }
}