// package Codeforces.TwoRabbits;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int distance = y - x;
            int speed = a + b;
            if (distance % speed == 0) {
                System.out.println(distance / speed);
            } else {
                System.out.println(-1);
            }
        }
    }
}
