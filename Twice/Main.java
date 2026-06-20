// package Codeforces.Twice;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]a=new int[n+1];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                a[x]++;
            }
            int ans=0;
            for(int i=1;i<=n;i++){
                ans+=a[i]/2;
            }
            System.out.println(ans);
        }
    }
}
