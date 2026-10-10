// package Codeforces.Cherry;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long maxprod=0;
            for(int i=0;i<n-1;i++){
                long prod=(long)Math.max(a[i],a[i+1])*Math.min(a[i],a[i+1]);
                maxprod=Math.max(maxprod, prod);
            }
            System.out.println(maxprod);
        }
    }
}
