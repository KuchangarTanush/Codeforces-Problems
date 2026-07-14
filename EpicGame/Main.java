// package Codeforces.EpicGame;

import java.util.*;

public class Main {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        while (true) {

            // Simon's turn
            int take = gcd(a, n);
            if (take > n) {
                System.out.println(1);
                return;
            }
            n -= take;

            // Antisimon's turn
            take = gcd(b, n);
            if (take > n) {
                System.out.println(0);
                return;
            }
            n -= take;
        }
    }
}