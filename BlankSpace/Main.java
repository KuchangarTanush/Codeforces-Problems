// package Codeforces.BlankSpace;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int s=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int count=0;
            for(int i=0;i<s;i++){
                int n=sc.nextInt();
                if(n==0){
                    count+=1;
                }else{
                    count=0;
                }
                max=Math.max(count,max);
            }
            System.out.println(max);

        }
    }
}