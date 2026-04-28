// package Codeforces.Maximize;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();

            int d = -1;

            // Find smallest divisor
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    d = i;
                    break;
                }
            }

            if (d == -1) {
                // x is prime
                System.out.println(x - 1);
            } else {
                System.out.println(x - d);
            }
        }
    }
}