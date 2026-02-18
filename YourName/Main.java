// package Codeforces.YourName;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (c-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
        sc.close();
    }
}
