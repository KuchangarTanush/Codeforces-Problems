// package Codeforces.OlympiadDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]cnt=new int[10];
            int ans=0;
            for (int i = 1; i <= n; i++) {
                int digit = sc.nextInt();
                cnt[digit]++;
            if(ans==0 && cnt[0]>=3 && cnt[1]>=1 && cnt[2]>=2 && cnt[3]>=1 && cnt[5]>=1
            ){
                ans=i;
            }
        }
        System.out.println(ans);
        }
    }
}
