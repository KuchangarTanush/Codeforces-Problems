// package Codeforces.PerfectRoot;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]a=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0; i < t; i++){
            for(int j = 1; j <= a[i]; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
