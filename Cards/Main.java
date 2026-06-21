// package Codeforces.Cards;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int z = 0, e = 0, r = 0, o = 0, nCount = 0;

        // Count characters
        for (char c : s.toCharArray()) {
            if (c == 'z') z++;
            else if (c == 'e') e++;
            else if (c == 'r') r++;
            else if (c == 'o') o++;
            else if (c == 'n') nCount++;
        }

        // "one" needs o,n,e
        int ones = Math.min(nCount, Math.min(o, e));

        // Remove characters used by ones
        o -= ones;
        e -= ones;

        // "zero" needs z,e,r,o
        int zeros = Math.min(z,
                    Math.min(e,
                    Math.min(r, o)));

        StringBuilder ans = new StringBuilder();

        // Maximum binary number -> all 1s first
        for (int i = 0; i < ones; i++) {
            ans.append("1 ");
        }

        for (int i = 0; i < zeros; i++) {
            ans.append("0 ");
        }

        System.out.println(ans);
    }
}