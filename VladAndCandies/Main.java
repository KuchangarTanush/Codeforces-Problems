// package Codeforces.VladAndCandies;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long max = 0;
            long secondMax = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if (x > max) {
                    secondMax = max;
                    max = x;
                } else if (x > secondMax) {
                    secondMax = x;
                }
            }

            if (max - secondMax > 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

        sc.close();
    }
}