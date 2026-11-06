// package Codeforces.t2023;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            long product = 1;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                product *= num;
            }

            if (2023 % product != 0) {

                System.out.println("NO");

            } else {

                System.out.println("YES");

                long missing = 2023 / product;

                for (int i = 0; i < k; i++) {

                    if (i == 0) {
                        System.out.print(missing);
                    } else {
                        System.out.print(" 1");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}


