// package Codeforces.SeatingInTheBus;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0) {
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean[] occupied=new boolean[n+2];
            occupied[arr[0]]=true;
            boolean valid=true;
            for(int i=1;i<n;i++){
                int seat=arr[i];
                if(!occupied[seat-1]&&!occupied[seat+1]){
                    valid=false;
                    break;
                }
                occupied[seat]=true;
            }
            if(valid){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}
