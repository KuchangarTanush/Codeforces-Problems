// package Codeforces.Showering;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            int last = 0;
            boolean possible = false;
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                if (l - last >= s) {
                    possible = true;
                }
                last = r;
            }
            if (m - last >= s) {
                possible = true;
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}

