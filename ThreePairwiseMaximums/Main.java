// package Codeforces.ThreePairwiseMaximums;
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int max = Math.max(x, Math.max(y, z));

            int count = 0;
            if (x == max) count++;
            if (y == max) count++;
            if (z == max) count++;

            if (count >= 2) {
                sb.append("YES").append("\n");

                int a = Math.min(x, y);
                int b = Math.min(x, z);
                int c = Math.min(y, z);

                sb.append(a + " " + b + " " + c).append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
