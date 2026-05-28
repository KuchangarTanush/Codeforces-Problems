// package Codeforces.YogurtSale;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int pairCost = Math.min(2 * a, b);
            int ans = (n / 2) * pairCost + (n % 2) * a;
            System.out.println(ans);
        }
    }
}
