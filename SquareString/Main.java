// package Codeforces.SquareString;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            if(n%2!=0){
                sb.append("N0").append("\n");
                continue;
            }
            String first=s.substring(0, n/2);
            String last=s.substring(n/2);
            if(first.equals(last)){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
