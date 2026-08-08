// package Codeforces.PhoneDesktop;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y =sc.nextInt();
            int screens=(y+1)/2;
            int remaining=15*screens-4*y;
            if(x>remaining){
                screens+=(x-remaining+14)/15;
            }
            System.out.println(screens);
        }
    }
}
