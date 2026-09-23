// package Codeforces.AplusB;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String[]a=s.split("\\+");
            int sum=0;
            for(int i=0;i<a.length;i++){
                sum+=Integer.parseInt(a[i]);
            }
            System.out.println(sum);
        }
    }
}
