import java.util.*;

public class Q_028 {

    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length() &&
                    haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        Q_028 obj = new Q_028();

        int answer = obj.strStr(haystack, needle);

        System.out.println(answer);

        sc.close();
    }
}