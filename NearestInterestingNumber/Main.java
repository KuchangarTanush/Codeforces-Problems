// package Codeforces.NearestInterestingNumber;
import java.util.Scanner;
public class Main {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            if (digitSum(a) % 4 == 0) {
                System.out.println(a);
                break;
            }
            a++;
        }
        sc.close();
    }
}
