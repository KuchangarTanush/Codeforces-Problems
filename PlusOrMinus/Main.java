// package Codeforces.PlusOrMinus;
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
            if((a+b)==c){
                sb.append("+").append("\n");
            }else if((a-b)==c){
                sb.append("-").append("\n");
            }
        }
        System.out.println(sb);
    }
}
