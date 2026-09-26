// package Codeforces.Koshary;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a % 2 + b % 2 <= 1){
            System.out.println("YES");
            }
            else{
            System.out.println("NO");
        }
        }
    }
}
