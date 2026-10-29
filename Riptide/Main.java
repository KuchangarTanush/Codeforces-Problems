// package Codeforces.Riptide;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int rounds = 0;
            while (a != b && b != c && a != c) {
                if (a > b && a > c) {
                    if (b < c) {
                        a--;
                        b++;
                    } else {
                        a--;
                        c++;
                    }
                } else if (b > a && b > c) {
                    if (a < c) {
                        b--;
                        a++;
                    } else {
                        b--;
                        c++;
                    }
                } else {
                    if (a < b) {
                        c--;
                        a++;
                    } else {
                        c--;
                        b++;
                    }
                }
                rounds++;
            }
            System.out.println(rounds);
        }
    }
}

