// package Codeforces.Journey;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long cycle = a + b + c;
            long fullCycles = n / cycle;
            long rem = n % cycle;

            long days = fullCycles * 3;

            if (rem == 0) {
                System.out.println(days);
            } else if (rem <= a) {
                System.out.println(days + 1);
            } else if (rem <= a + b) {
                System.out.println(days + 2);
            } else {
                System.out.println(days + 3);
            }
        }
    }
}
