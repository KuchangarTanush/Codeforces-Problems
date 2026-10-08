// package Codeforces.MinMaxSwap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int maxA = 0;
            int maxB = 0;
            for (int i = 0; i < n; i++) {
                int small = Math.min(a[i], b[i]);
                int large = Math.max(a[i], b[i]);
                maxA = Math.max(maxA, small);
                maxB = Math.max(maxB, large);
            }
            System.out.println((long) maxA * maxB);
        }
    }
}
