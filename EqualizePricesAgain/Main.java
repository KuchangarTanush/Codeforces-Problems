// package Codeforces.EqualizePricesAgain;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            if (sum % n == 0) {
                System.out.println(sum / n);
            } else {
                System.out.println((sum / n) + 1);
            }
        }
    }
}
