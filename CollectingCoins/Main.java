// package Codeforces.CollectingCoins;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int total = a + b + c + n;

            if (total % 3 != 0) {
                System.out.println("NO");
                continue;
            }

            int target = total / 3;

            if (target >= a && target >= b && target >= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
