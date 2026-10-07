// package Codeforces.TaisiaandDice;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int r = sc.nextInt();
            int max = s - r;
            int[] a = new int[n];
            for (int i = 0; i < n - 1; i++) {
                a[i] = 1;
            }
            int currentSum = n - 1;
            for (int i = 0; i < n - 1; i++) {
                int increase = Math.min(max - 1, r - currentSum);
                a[i] += increase;
                currentSum += increase;
            }
            a[n - 1] = max;
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}