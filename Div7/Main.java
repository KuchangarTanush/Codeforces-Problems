// package Codeforces.Div7;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String n = sc.next();
            int best = 1000;
            int min = 10;

            for (int i = 14; i <= 999; i += 7) {

                String s = String.valueOf(i);

                // same number of digits
                if (s.length() != n.length()) {
                    continue;
                }

                int diff = 0;

                for (int j = 0; j < n.length(); j++) {
                    if (n.charAt(j) != s.charAt(j)) {
                        diff++;
                    }
                }

                if (diff < min) {
                    min = diff;
                    best = i;
                }
            }

            System.out.println(best);
        }
    }
}