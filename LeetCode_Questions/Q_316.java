import java.util.*;

public class Q_316 {

    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        boolean[] used = new boolean[26];

        char[] stack = new char[s.length()];

        int top = -1;

        for (char c : s.toCharArray()) {

            int index = c - 'a';

            freq[index]--;

            if (used[index]) {
                continue;
            }

            while (top >= 0 &&
                    stack[top] > c &&
                    freq[stack[top] - 'a'] > 0) {

                used[stack[top] - 'a'] = false;

                top--;
            }

            stack[++top] = c;

            used[index] = true;
        }

        return new String(stack, 0, top + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Q_316 q = new Q_316();

        System.out.println(q.removeDuplicateLetters(s));

        sc.close();
    }
}