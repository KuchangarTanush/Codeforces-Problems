// package Codeforces.Minority;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int zero = 0;
            int one = 0;

            for (char c : s.toCharArray()) {
                if (c == '0')
                    zero++;
                else
                    one++;
            }

            if (zero == one)
                System.out.println(zero - 1);
            else
                System.out.println(Math.min(zero, one));
        }

        sc.close();
    }
}
