// package Codeforces.OddOneOut;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a!=b && b==c){
                sb.append(a).append('\n');
            }else if(b!=a && a==c){
                sb.append(b).append('\n');
            }else{
                sb.append(c).append('\n');
            }
        }
        System.out.println(sb);
    }
}