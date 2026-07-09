// package Codeforces.NewYearAndHurry;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int time=240;
        int lefttime=time-k;
        int ans=0;
        int cnt=0;
        for(int i=1;i<=n;i++){
            ans+=5 *i;
            if(ans<=lefttime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
