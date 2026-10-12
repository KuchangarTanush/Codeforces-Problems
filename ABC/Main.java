// package Codeforces.ABC;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (Math.abs(zeros - ones) <= 1 && n <= 2) {
                System.out.println("YES");
            } else if (n == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

