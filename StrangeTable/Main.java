// package Codeforces.StrangeTable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();

            long pos = x - 1;

            long row = pos % n;
            long col = pos / n;

            long ans = row * m + col + 1;

            System.out.println(ans);
        }

        sc.close();
    }
}