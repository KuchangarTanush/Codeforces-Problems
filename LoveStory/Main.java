// package Codeforces.LoveStory;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a="codeforces";
        while(t-->0){
            String s=sc.next();
            int ans=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=a.charAt(i)){
                    ans+=1;
                }
            }
            System.out.println(ans);
        }
    }
}