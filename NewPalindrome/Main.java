// package Codeforces.NewPalindrome;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int[] freq = new int[26];
            int distinct = 0;

            for (char ch : s.toCharArray()) {
                if (freq[ch - 'a'] == 0) distinct++;
                freq[ch - 'a']++;
            }

            if (distinct == 1) {
                System.out.println("NO");
                continue;
            }

            boolean singleOdd = false;
            int oddCount = 0;

            for (int f : freq) {
                if (f % 2 == 1) {
                    oddCount++;
                    if (f == 1) singleOdd = true;
                }
            }

            if (distinct == 2 && singleOdd) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
