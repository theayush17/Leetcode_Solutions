import java.util.*;

public class Q_058 {

    // Solution
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // Skip spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        // Count the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();

        // Create object
        Q_058 obj = new Q_058();

        // Call method
        int answer = obj.lengthOfLastWord(s);

        // Print answer
        System.out.println("Length of Last Word: " + answer);

        sc.close();
    }
}