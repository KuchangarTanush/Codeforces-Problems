// package Codeforces.Minimize;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int min=Integer.MAX_VALUE;
            int ans1=0;
            
            for(int c=0;c<b;c++){
                int ans=(c-a)+(b-c);
                ans1=Math.min(ans,min);
                
            }
            sb.append(ans1).append("\n");
           
        }
         System.out.println(sb);
    }
}
