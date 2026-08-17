// package Codeforces.FindTheArray;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int s=sc.nextInt();
            int n=1;
            while(n*(2*n+1)/2<s){
                n++;
            }
            System.out.println(n);
        }
    }
}
