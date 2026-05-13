// package Codeforces.Quintomania;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean perfect = true;

            for (int i = 1; i < n; i++) {

                int diff = Math.abs(arr[i] - arr[i - 1]);

                if (diff != 5 && diff != 7) {
                    perfect = false;
                    break;
                }
            }

            if (perfect) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}