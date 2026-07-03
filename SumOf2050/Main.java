// package Codeforces.SumOf2050;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long n = sc.nextLong();

            if (n % 2050 != 0) {
                System.out.println(-1);
                continue;
            }

            long x = n / 2050;
            int ans = 0;

            while (x > 0) {
                ans += x % 10;
                x /= 10;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
