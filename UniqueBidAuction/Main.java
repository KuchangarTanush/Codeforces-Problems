// package Codeforces.UniqueBidAuction;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }
            int ans = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (freq[a[i]] == 1 && a[i] < min) {
                    min = a[i];
                    ans = i + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
