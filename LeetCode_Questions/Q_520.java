import java.util.*;

public class Q_520 {

    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        return capitalCount == 0 ||
                capitalCount == word.length() ||
                (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        Q_520 obj = new Q_520();

        boolean answer = obj.detectCapitalUse(word);

        System.out.println(answer);

        sc.close();
    }
}