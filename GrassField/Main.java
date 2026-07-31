// package Codeforces.GrassField;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int count = 0;

            for (int i = 0; i < 4; i++) {
                count += sc.nextInt();
            }

            if (count == 0)
                System.out.println(0);
            else if (count == 4)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
}