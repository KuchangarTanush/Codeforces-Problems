// package Codeforces.PrependAndAppend;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=sc.nextInt();
            String s =sc.next();
            int left=0;
            int right=s.length()-1;
            while(left<right){
                if(s.charAt(left)!=(s.charAt(right))){
                    left++;
                    right--;
                }else{
                    break;
                }
            }
            sb.append(right-left+1).append("\n");
        }
        System.out.println(sb);
    }
}
