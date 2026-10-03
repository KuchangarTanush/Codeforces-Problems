// package Codeforces.SumOfThreeNumbers;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n <= 6 || n == 9) {
                System.out.println("NO");
            }
            else if (n % 3 == 0) {
                System.out.println("YES");
                System.out.println("1 4 " + (n - 5));
            }
            else {
                System.out.println("YES");
                System.out.println("1 2 " + (n - 3));
            }
        }
    }
}