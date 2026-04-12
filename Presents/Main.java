// package Codeforces.Presents;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] result = new int[n + 1];

        // Input
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        // Reverse mapping
        for (int i = 1; i <= n; i++) {
            result[p[i]] = i;
        }

        // Output
        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}