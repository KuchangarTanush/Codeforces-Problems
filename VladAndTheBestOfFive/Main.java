// package Codeforces.VladAndTheBestOfFive;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int cnta=0,cntb=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A'){
                    cnta++;
                }else{
                    cntb++;
                }
            }
            if(cnta>cntb){
                sb.append("A").append('\n');
            }else{
                sb.append("B").append('\n');
            }
        }
        System.out.println(sb);
    }
}
