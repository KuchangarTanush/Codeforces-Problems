// package Codeforces.AmbitiousKid;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]a=new int[t];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
    
        for(int i=0;i<a.length;i++){
            int diff=Math.abs(a[i])-0;
            min=Math.min(min,diff);
        }
        System.out.println(min);
    }
}
