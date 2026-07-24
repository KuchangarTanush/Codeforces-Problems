// package Codeforces.TalesOfASort;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[]a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long ans=0;
            long suffix=a[n-1];
            for(int i=n-2;i>=0;i--){
                if(a[i]>suffix){
                ans=Math.max(ans, a[i]);
                }
                suffix=Math.min(suffix,a[i]);
            }
            System.out.println(ans);
        }
    }
}
