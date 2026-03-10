// package Codeforces.Translation;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String s=new StringBuilder(a).reverse().toString();
        if(s.equals(b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}