import java.util.*;

public class Q_0171 {

    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String columnTitle = sc.nextLine();

        Q_0171 obj = new Q_0171();

        int answer = obj.titleToNumber(columnTitle);

        System.out.println(answer);

        sc.close();
    }
}