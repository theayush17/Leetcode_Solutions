import java.util.*;

public class Q_500 {

    // Solution
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {

            String lowerWord = word.toLowerCase();

            // Determine the row of the first character
            int row;

            if (row1.indexOf(lowerWord.charAt(0)) != -1) {
                row = 1;
            } else if (row2.indexOf(lowerWord.charAt(0)) != -1) {
                row = 2;
            } else {
                row = 3;
            }

            boolean valid = true;

            // Check every character
            for (int i = 1; i < lowerWord.length(); i++) {

                char ch = lowerWord.charAt(i);

                int currentRow;

                if (row1.indexOf(ch) != -1) {
                    currentRow = 1;
                } else if (row2.indexOf(ch) != -1) {
                    currentRow = 2;
                } else {
                    currentRow = 3;
                }

                // Different row → invalid word
                if (currentRow != row) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // Create object
        Q_500 obj = new Q_500();

        // Call method
        String[] answer = obj.findWords(words);

        // Print answer
        System.out.print("Answer: [");

        for (int i = 0; i < answer.length; i++) {

            System.out.print(answer[i]);

            if (i < answer.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}