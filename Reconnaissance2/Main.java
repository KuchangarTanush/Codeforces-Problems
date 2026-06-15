// package Codeforces.Reconnaissance2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]a=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        int mindiff=Integer.MAX_VALUE;
        int ans1=0,ans2=1;
        for(int i=0;i<t-1;i++){
            int diff=Math.abs(a[i]-a[i+1]);
            if(diff<mindiff){
                mindiff=diff;
                ans1=i;
                ans2=i+1;
            }
        }
        int diff = Math.abs(a[t - 1] - a[0]);

        if (diff < mindiff) {
            ans1 = t - 1;
            ans2 = 0;
        }

        System.out.println((ans1 + 1) + " " + (ans2 + 1));
    }
}
