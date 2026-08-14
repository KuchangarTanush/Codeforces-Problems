// package Codeforces.InTheDream;
import java.util.*;
public class Main {
    static boolean possible(int x,int y){
        int bigger=Math.max(x,y);
        int smaller=Math.min(x,y);
        return bigger<=2*(smaller+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            boolean first=possible(a, b);
            int x=c-a;
            int y=d-b;
            boolean second=possible(x, y);
            if(first && second){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
