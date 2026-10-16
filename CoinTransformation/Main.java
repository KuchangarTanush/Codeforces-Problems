// package Codeforces.CoinTransformation;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long coins=1;
            while(n>3){
                n=n/4;
                coins*=2;
            }
            System.out.println(coins);
        }
    }
}
