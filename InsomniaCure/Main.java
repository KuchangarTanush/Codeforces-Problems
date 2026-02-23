// package Codeforces.InsomniaCure;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();//frypan
        int l=sc.nextInt();//tail shut
        int m=sc.nextInt();//sharp heels
        int n=sc.nextInt();//threat
        int d=sc.nextInt();//no of dragons
        int count=0;
        for(int i=1;i<=d;i++){
            if (i % k == 0 ||
        i % l == 0 ||
        i % m == 0 ||
        i % n == 0)
        count++;
        
        }
        System.out.println(count);
    }
}
