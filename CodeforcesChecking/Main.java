// package Codeforces.CodeforcesChecking;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String s = "codeforces";
        while (t-- > 0) {
            char c = sc.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}