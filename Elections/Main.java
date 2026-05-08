// package Codeforces.Elections;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Math.max(a, Math.max(b, c));
            int ra = (a == max && a > b && a > c) ? 0 : max - a + 1;
            int rb = (b == max && b > a && b > c) ? 0 : max - b + 1;
            int rc = (c == max && c > a && c > b) ? 0 : max - c + 1;
            sb.append(ra+" "+rb+" "+rc).append("\n");
        }
        System.out.println(sb);
    }
}