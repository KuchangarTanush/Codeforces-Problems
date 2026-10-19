// package Codeforces.EatingGame;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a > max) {
                    max = a;
                    count = 1;
                } else if (a == max) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}