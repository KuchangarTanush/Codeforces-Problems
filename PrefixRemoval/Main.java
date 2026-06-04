// package Codeforces.PrefixRemoval;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();
            StringBuilder ans = new StringBuilder(s);

            while (true) {

                int n = ans.length();
                int remove = 0;

                int[] freq = new int[26];

                for (int i = 0; i < n; i++) {
                    freq[ans.charAt(i) - 'a']++;
                }

                for (int i = 0; i < n; i++) {

                    char c = ans.charAt(i);

                    if (freq[c - 'a'] > 1) {
                        remove++;
                        freq[c - 'a']--;
                    } else {
                        break;
                    }
                }

                if (remove == 0)
                    break;

                ans.delete(0, remove);
            }

            System.out.println(ans);
        }
    }
}