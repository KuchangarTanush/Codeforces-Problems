// package Codeforces.FrogJumping;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            long minus=k/2;
            long plus=k-minus;
            System.out.println((plus*a)-(minus*b));
        }
    }
}
