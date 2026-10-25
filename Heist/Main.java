// package Codeforces.Heist;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        int stolen = (max - min + 1) - n;

        System.out.println(stolen);

        sc.close();
    }
}

