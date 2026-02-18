// package Codeforces.SieveOfErato67henes;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int s=sc.nextInt();
            int[]a=new int[s];
            for(int i=0;i<s;i++){
                a[i]=sc.nextInt();
            }
            boolean found=false;
            for(int i=0;i<a.length;i++){
                if(a[i]==67){
                    found=true;
                    break;
                }
            }
             if (found) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }
}
