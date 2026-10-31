// package Codeforces.Password;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }
            int available = 10 - n;
            int ans = 3 * available * (available - 1);
            System.out.println(ans);
        }
    }
}

