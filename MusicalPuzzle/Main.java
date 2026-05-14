// package Codeforces.MusicalPuzzle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<String> set = new HashSet<>();

            for (int i = 0; i < n - 1; i++) {
                String sub = s.substring(i, i + 2);
                set.add(sub);
            }

            System.out.println(set.size());
        }
    }
}