// package Codeforces.SkibidusAndAmogu;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = sc.next();
            String sub = "us";

            int idx = s.lastIndexOf(sub);

            if (idx != -1) {
                String result = s.substring(0, idx) + "i" + s.substring(idx + 2);
                sb.append(result).append("\n");
            } else {
                sb.append(s).append("\n");
            }
        }

        System.out.print(sb);
    }
}