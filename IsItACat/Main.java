// package Codeforces.IsItACat;
import java.util.*;

public class Main {

    static boolean isCatMeow(String s) {
        int n = s.length();
        int i = 0;

        // m or M sequence
        if (i >= n || (s.charAt(i) != 'm' && s.charAt(i) != 'M'))
            return false;

        while (i < n && (s.charAt(i) == 'm' || s.charAt(i) == 'M')) {
            i++;
        }

        // e or E sequence
        if (i >= n || (s.charAt(i) != 'e' && s.charAt(i) != 'E'))
            return false;

        while (i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;
        }

        // o or O sequence
        if (i >= n || (s.charAt(i) != 'o' && s.charAt(i) != 'O'))
            return false;

        while (i < n && (s.charAt(i) == 'o' || s.charAt(i) == 'O')) {
            i++;
        }

        // w or W sequence
        if (i >= n || (s.charAt(i) != 'w' && s.charAt(i) != 'W'))
            return false;

        while (i < n && (s.charAt(i) == 'w' || s.charAt(i) == 'W')) {
            i++;
        }

        return i == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(isCatMeow(s) ? "YES" : "NO");
        }

        sc.close();
    }
}
