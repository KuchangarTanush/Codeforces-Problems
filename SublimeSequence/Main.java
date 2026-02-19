// package Codeforces.SublimeSequence;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            if(n%2==0){
                sb.append(0).append('\n');
            }else{
                sb.append(x).append('\n');
            }
        }
        System.out.println(sb);
    }
}
