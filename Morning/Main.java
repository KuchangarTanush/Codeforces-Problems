// package Codeforces.Morning;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int current = 1;
            int ans = 0;

            for (int i = 0; i < 4; i++) {
                int digit = s.charAt(i) - '0';
                if (digit == 0) {
                    digit = 10;
                }
                ans += Math.abs(digit - current);

                ans += 1; // press

                current = digit;
            }

            System.out.println(ans);
        }
    }
}