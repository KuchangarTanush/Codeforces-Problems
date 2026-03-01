// package Codeforces.WayTooLongWords;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            if(s.length()>10){
                String sub=s.substring(1, n-1);
                sb.append(s.charAt(0)).append(sub.length()).append(s.substring(n-1)).append('\n');
            }else{
                sb.append(s).append('\n');
            }
        }
        System.out.println(sb);
    }
}