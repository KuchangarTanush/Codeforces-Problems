// package Codeforces.SpellCheck;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            // Step 1: Length must be 5
            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            // Step 2: Sort both strings and compare
            char[] input = s.toCharArray();
            char[] target = {'T', 'i', 'm', 'u', 'r'};

            Arrays.sort(input);
            Arrays.sort(target);

            if (Arrays.equals(input, target)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}