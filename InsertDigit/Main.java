// package Codeforces.InsertDigit;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            String s=sc.next();
            boolean inserted=false;
            for(char c:s.toCharArray()){
                int ch=c-'0';
                if(!inserted && ch<a){
                    sb.append(a);
                    inserted=true;
                }
                sb.append(c);
                
            }
            if (!inserted) {
                sb.append(a);
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
