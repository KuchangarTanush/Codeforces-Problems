// package Codeforces.CPlusEquals;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int n =sc.nextInt();
            int op=0;
            while(Math.max(a, b)<=n){
                if(a<b){
                    a+=b;
                }else{
                    b+=a;
                }
                op++;
            }
            System.out.println(op);
        }
    }
}
