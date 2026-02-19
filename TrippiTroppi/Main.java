// package Codeforces.TrippiTroppi;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-- > 0) {
            
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

           sb.append(a.charAt(0))
              .append(b.charAt(0))
              .append(c.charAt(0))
              .append('\n');
            
        }
        System.out.println(sb);
    }
}
