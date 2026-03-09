// package Codeforces.SoldierAndBananas;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++){
            sum+=k*i;
        }
        int ans=0;
        if(sum>n){
            ans=Math.abs(sum-n);
        }else{
            ans=0;
        }
        System.out.println(ans);
    }
}