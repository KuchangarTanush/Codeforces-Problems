// package Codeforces.MorningSandwitch;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int h=sc.nextInt();
            int fillings=Math.min(c+h,b-1);
            System.out.println(2*fillings+1);
        }
    }
}
