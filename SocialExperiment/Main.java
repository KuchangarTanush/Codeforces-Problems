// package Codeforces.SocialExperiment;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            if(n<=3){
                ans=n;
                
            }else{
                if(n%2==0){
                    ans=0;
                }else{
                    ans=1;
                }
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}
