package Codeforces.ToZero;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % 2 == 0) {
                System.out.println((n + (k - 2)) / (k - 1));
            } else {
                long rem = n - k;
                System.out.println(1 + (rem + (k - 2)) / (k - 1));
            }
        }
    }
}
