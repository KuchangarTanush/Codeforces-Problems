// package Codeforces.BrogrammingContest;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ans = 0;
            if (s.charAt(0) == '1') {
                ans++;
            }
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
