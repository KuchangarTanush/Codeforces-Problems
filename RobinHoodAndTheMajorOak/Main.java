// package Codeforces.RobinHoodAndTheMajorOak;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            long sum = (k * (2 * n - k + 1)) / 2;

            if (sum % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}