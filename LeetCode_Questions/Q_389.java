import java.util.*;

public class Q_389 {

    public char findTheDifference(String s, String t) {
        int result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return (char) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        Q_389 obj = new Q_389();

        char answer = obj.findTheDifference(s, t);

        System.out.println(answer);

        sc.close();
    }
}