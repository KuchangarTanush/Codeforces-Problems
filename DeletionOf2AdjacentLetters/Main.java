// package Codeforces.DeletionOf2AdjacentLetters;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            char c=sc.next().charAt(0);
            boolean flag=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c && i%2==0){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
