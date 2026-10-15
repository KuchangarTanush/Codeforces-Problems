// package Codeforces.GregsWorkout;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0;
        int biceps = 0;
        int back = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (i % 3 == 0) {
                chest += a;
            } else if (i % 3 == 1) {
                biceps += a;
            } else {
                back += a;
            }
        }
        if (chest > biceps && chest > back) {
            System.out.println("chest");
        } else if (biceps > chest && biceps > back) {
            System.out.println("biceps");
        } else {
            System.out.println("back");
        }
        sc.close();
    }
}

