// package Codeforces.ColorfulStones;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int pos = 0; // 0-based index
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pos) == t.charAt(i)) {
                pos++;
            }
        }

        System.out.println(pos + 1);
    }
}
