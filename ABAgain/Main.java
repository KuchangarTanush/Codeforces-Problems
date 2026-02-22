// package Codeforces.ABAgain;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n/=10;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
