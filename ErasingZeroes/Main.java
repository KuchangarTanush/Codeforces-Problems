// package Codeforces.ErasingZeroes;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int first = -1;
            int last = -1;

            // Find first and last '1'
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }

            int ans = 0;

            // Count zeros between first and last 1
            if (first != -1) {
                for (int i = first; i <= last; i++) {
                    if (s.charAt(i) == '0') {
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}