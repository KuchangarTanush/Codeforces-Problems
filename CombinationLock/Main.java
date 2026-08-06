// package Codeforces.CombinationLock;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        int ans=0;
        for(int i=0;i<n;i++){
            int a=s.charAt(i)-'0';
            int b=t.charAt(i)-'0';
            int diff=Math.abs(a-b);
            ans+=Math.min(diff,10-diff);
        }
        System.out.println(ans);
    }
}
