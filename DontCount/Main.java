// package Codeforces.DontCount;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            StringBuilder sb = new StringBuilder(x);
            int ans = 0;
            boolean found = false;

            // Check without any operation first
            if (sb.toString().contains(s)) {
                found = true;
            } else {
                // Try doubling up to a safe number of times.
                // Since n*m <= 25, s can't be longer than 25 chars,
                // so a small number of doublings is always enough to decide.
                int maxOps = 20;
                for (int i = 1; i <= maxOps; i++) {
                    sb.append(sb); // x = x + x
                    ans = i;
                    if (sb.toString().contains(s)) {
                        found = true;
                        break;
                    }
                    // Safety: if sb is already much longer than s and still
                    // not found, keep doubling anyway since maxOps is small
                    // and n*m<=25 keeps this cheap.
                }
            }

            result.append(found ? ans : -1).append('\n');
        }

        System.out.print(result);
    }
}