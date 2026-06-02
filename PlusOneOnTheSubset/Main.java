// package Codeforces.PlusOneOnTheSubset;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            System.out.println(max - min);
        }

        sc.close();
    }
}