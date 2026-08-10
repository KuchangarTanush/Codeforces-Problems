// package Codeforces.DoorAndKeys;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean r = false;
            boolean g = false;
            boolean b = false;
            boolean possible = true;
            for (char c : s.toCharArray()) {
                if (c == 'r') {
                    r = true;
                } else if (c == 'g') {
                    g = true;
                } else if (c == 'b') {
                    b = true;
                }

                else if (c == 'R' && !r) {
                    possible = false;
                    break;
                } else if (c == 'G' && !g) {
                    possible = false;
                    break;
                } else if (c == 'B' && !b) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
