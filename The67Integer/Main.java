// package Codeforces.The67Integer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int sum = 0;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < 7; i++) {

                int a = sc.nextInt();

                sum += a;
                max = Math.max(max, a);
            }
            int ans = 2 * max - sum;
            System.out.println(ans);
        }
    }
}