// package Codeforces.WhosOpposite;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long diff = Math.abs(a - b);
            long n = 2 * diff;

            // Check whether such a circle exists
            if (a > n || b > n || c > n) {
                System.out.println(-1);
                continue;
            }

            long ans = c + diff;

            if (ans > n) {
                ans = c - diff;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
