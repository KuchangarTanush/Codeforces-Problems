// package Codeforces.Division;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            if(n>=1900){
                sb.append("Division 1").append("\n");
            }else if(1600<=n&& n<=1899){
                sb.append("Division 2").append("\n");
            }else if(1400<=n&&n<=1599){
                sb.append("Division 3").append("\n");
            }else{
                sb.append("Division 4").append("\n");
            }
        }
        System.out.println(sb);
    }
}