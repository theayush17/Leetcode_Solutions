import java.util.*;

public class Q_014 {

    // Solution
    public String longestCommonPrefix(String[] strs) {

        // Take the first string as the initial prefix
        String prefix = strs[0];

        // Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {

            int j = 0;

            // Compare characters while they are equal
            while (j < prefix.length()
                    && j < strs[i].length()
                    && prefix.charAt(j) == strs[i].charAt(j)) {

                j++;
            }

            // Keep only the common part
            prefix = prefix.substring(0, j);

            // If no common prefix exists
            if (prefix.length() == 0) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        // Create object
        Q_014 obj = new Q_014();

        // Call method
        String answer = obj.longestCommonPrefix(strs);

        // Print answer
        System.out.println("Longest Common Prefix: " + answer);

        sc.close();
    }
}