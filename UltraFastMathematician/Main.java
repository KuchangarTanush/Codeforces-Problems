// package Codeforces.UltraFastMathematician;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length();i++){
            char curr=(char)(((a.charAt(i)-'0')^(b.charAt(i)-'0'))+ '0');
            sb.append(curr);
        }
        System.out.println(sb.toString());
    }
}
