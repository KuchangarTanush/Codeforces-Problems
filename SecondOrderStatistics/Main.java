// package Codeforces.SecondOrderStatistics;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int first = a[0];
        int i = 1;

        while (i < n && a[i] == first) {
            i++;
        }

        if (i == n) {
            System.out.println("NO");
        } else {
            System.out.println(a[i]);
        }
    }
}
