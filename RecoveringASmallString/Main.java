// package Codeforces.RecoveringASmallString;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            for (int i = 1; i <= 26; i++) {
                if (n - i >= 2 && n - i <= 52) {
                    ans.append((char) ('a' + i - 1));
                    n -= i;
                    break;
                }
            }

            for (int i = 1; i <= 26; i++) {
                if (n - i >= 1 && n - i <= 26) {
                    ans.append((char) ('a' + i - 1));
                    n -= i;
                    break;
                }
            }

            ans.append((char) ('a' + n - 1));

            System.out.println(ans);
        }
    }
}