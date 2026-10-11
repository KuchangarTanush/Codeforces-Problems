// package Codeforces.ItsTimeToDuel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean hasZero = false;
            boolean consecutiveZeros = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] == 0) {
                    hasZero = true;
                }

                if (i > 0 && a[i] == 0 && a[i - 1] == 0) {
                    consecutiveZeros = true;
                }
            }

            if (!hasZero || consecutiveZeros) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
