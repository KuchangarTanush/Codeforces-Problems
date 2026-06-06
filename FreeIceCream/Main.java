// package Codeforces.FreeIceCream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        int distressed = 0;

        for (int i = 0; i < n; i++) {

            char op = sc.next().charAt(0);
            long d = sc.nextLong();

            if (op == '+') {
                x += d;
            } 
            else if (op == '-') {
                if (x >= d) {
                    x -= d;
                } 
                else {
                    distressed++;
                }
            }
        }

        System.out.println(x + " " + distressed);

        sc.close();
    }
}