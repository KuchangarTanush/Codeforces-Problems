package Codeforces.StairPeakOrNeither;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<b){
                if(b<c){
                    sb.append("STAIR").append('\n');
                }else if(b>c){
                    sb.append("PEAK").append('\n');
                }else{
                    sb.append("NONE").append('\n');
                }
            }else{
                sb.append("NONE").append('\n');
            }
        }
        System.out.println(sb);
    }
}
