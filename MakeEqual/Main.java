// package Codeforces.MakeEqual;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }

            long avg = sum / n;
            long prefix = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                prefix += a[i];
                if (prefix < (long) (i + 1) * avg) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}