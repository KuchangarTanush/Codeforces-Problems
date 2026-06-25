// package Codeforces.DecodeString;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            String t=sc.next();
            StringBuilder ans=new StringBuilder();
            int i=n-1;
            while(i>=0){
                if(t.charAt(i)=='0'){
                    int num = Integer.parseInt(t.substring(i - 2, i));
                    ans.append((char) ('a' + num - 1));
                    i -= 3;
                }else{
                    int num=t.charAt(i)-'0';
                    ans.append((char)('a'+num-1));
                    i--;
                }
            }
             System.out.println(ans.reverse().toString());
        }
    }
}
