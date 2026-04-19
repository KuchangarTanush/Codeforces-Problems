// package Codeforces.RestoringThreeNumbers;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int max1=Math.max(a, b);
        int max2=Math.max(max1,c);
        int max=Math.max(max2,d);
        int[]arr={a,b,c,d};
        for(int i=0;i<arr.length;i++){
            if((max-arr[i])>0){
                sb.append(max-arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
