// package Codeforces.MakeEven;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();

            int len = n.length();

            // Last digit is even
            if ((n.charAt(len - 1) - '0') % 2 == 0) {
                System.out.println(0);
            }
            // First digit is even
            else if ((n.charAt(0) - '0') % 2 == 0) {
                System.out.println(1);
            }
            // Check if any even digit exists
            else {
                boolean hasEven = false;

                for (int i = 1; i < len - 1; i++) {
                    if ((n.charAt(i) - '0') % 2 == 0) {
                        hasEven = true;
                        break;
                    }
                }

                if (hasEven) {
                    System.out.println(2);
                } else {
                    System.out.println(-1);
                }
            }
        }

        sc.close();
    }
}