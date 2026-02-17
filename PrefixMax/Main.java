// package Codeforces.PrefixMax;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         StringBuilder sb = new StringBuilder();
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
            }
            sb.append(max * n).append("\n");
        }
        System.out.print(sb);
    }
}
