import java.util.*;

public class Q_205 {

    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        Arrays.fill(mapS, -1);
        Arrays.fill(mapT, -1);

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS[a] == -1 && mapT[b] == -1) {
                mapS[a] = b;
                mapT[b] = a;
            } else if (mapS[a] != b || mapT[b] != a) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        Q_205 obj = new Q_205();

        boolean answer = obj.isIsomorphic(s, t);

        System.out.println(answer);

        sc.close();
    }
}