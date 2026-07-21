// package Codeforces.EvenArray;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int evenwrong=0,oddwrong=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(i%2==0){
                    if(x%2!=0){
                        evenwrong++;
                    }
                }else{
                    if(x%2==0){
                        oddwrong++;
                    }
                }
            }
            if(evenwrong==oddwrong){
                System.out.println(evenwrong);
            }else{
                System.out.println(-1);
            }
        }
    }
}
