// package Codeforces.Tram;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int capacity=0;
        int max=0;
        while(t-->0){
            int out=sc.nextInt();
            int in=sc.nextInt();
            capacity+=in;
            capacity-=out;
            max=Math.max(capacity,max);
        }
        System.out.println(max);
    }
}
