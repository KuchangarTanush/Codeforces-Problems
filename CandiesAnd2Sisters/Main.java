// package Codeforces.CandiesAnd2Sisters;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            int result = (n - 1) / 2;  
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}

