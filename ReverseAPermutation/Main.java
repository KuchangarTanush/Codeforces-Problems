// package Codeforces.ReverseAPermutation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            int start = 0;
            while (start < n && p[start] == n - start) {
                start++;
            }
            if (start < n) {
                int pos = start;
                for (int i = start; i < n; i++) {
                    if (p[i] > p[pos]) {
                        pos = i;
                    }
                }
                int left = start;
                int right = pos;
                while (left < right) {
                    int temp = p[left];
                    p[left] = p[right];
                    p[right] = temp;
                    left++;
                    right--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + (i == n - 1 ? "\n" : " "));
            }
        }
    }
}

