// package Codeforces.WalletExchange;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if ((a + b) % 2 == 1)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }
    }
}