import java.util.*;

public class Q_599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);

                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[i]);
                } else if (sum == minSum) {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] list1 = new String[n1];

        for (int i = 0; i < n1; i++) {
            list1[i] = sc.next();
        }

        int n2 = sc.nextInt();
        String[] list2 = new String[n2];

        for (int i = 0; i < n2; i++) {
            list2[i] = sc.next();
        }

        Q_599 obj = new Q_599();

        String[] answer = obj.findRestaurant(list1, list2);

        System.out.println(Arrays.toString(answer));

        sc.close();
    }
}