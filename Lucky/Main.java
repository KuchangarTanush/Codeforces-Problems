// package Codeforces.Lucky;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int sum1=0,sum2=0;
            for(int i=0;i<3;i++){
                sum1+=(s.charAt(i)-'0');
                
            }
            for(int i=3;i<6;i++){
                sum2+=(s.charAt(i)-'0');
            }
            if(sum1==sum2){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
