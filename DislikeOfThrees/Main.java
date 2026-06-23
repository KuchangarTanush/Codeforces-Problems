// package Codeforces.DislikeOfThrees;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            int count = 0;
            int num = 1;

            while (true) {
                // number is liked
                if (num % 3 != 0 && num % 10 != 3) {
                    count++;
                }

                if (count == k) {
                    System.out.println(num);
                    break;
                }

                num++;
            }
        }

        sc.close();
    }
}