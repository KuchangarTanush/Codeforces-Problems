// package Codeforces.Sum;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==(b+c)){
                sb.append("YES").append("\n");
            }else if(b==(a+c)){
                sb.append("YES").append("\n");
            }else if(c==(a+b)){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
