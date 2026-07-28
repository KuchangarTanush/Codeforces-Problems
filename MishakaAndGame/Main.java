// package Codeforces.MishakaAndGame;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mishaka=0;
        int chris=0;
        while(n-->0){
            int m=sc.nextInt();
            int c=sc.nextInt();
            if(m>c){
                mishaka++;
            }else if(c>m){
                chris++;
            }else{
                mishaka++;
                chris++;
            }
        }
        if(mishaka==chris){
            System.out.println("Friendship is magic!^^");
        }else if(mishaka>chris){
            System.out.println("Mishka");
        }else{
            System.out.println("Chris");
        }
    }
}
