// package Codeforces.Sale;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[]a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int ans=0;
        int cnt=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0 && cnt<n){
                ans+=-a[i];
                cnt++;
            }
        }
        System.out.println(ans);
    }
}
