// package Codeforces.DrTC;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ones = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ones++;
                }
            }

            int zeros = n - ones;

            int ans = zeros * (ones + 1) + ones * (ones - 1);

            System.out.println(ans);
        }

        sc.close();
    }
}
