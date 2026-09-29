// package Codeforces.ShaassandOskols;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            int left = y - 1;
            int right = a[x] - y;
            if (x > 0) {
                a[x - 1] += left;
            }
            if (x < n - 1) {
                a[x + 1] += right;
            }
            a[x] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
