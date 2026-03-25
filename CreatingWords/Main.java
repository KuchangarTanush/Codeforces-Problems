// package Codeforces.CreatingWords;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            if(a.length()>0 && b.length()>0){
                char first=a.charAt(0);
                char second=b.charAt(0);

                String new1=second+a.substring(1);
                String new2=first+b.substring(1);
                sb.append(new1).append(" ").append(new2).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}