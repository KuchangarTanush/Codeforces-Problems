// package Codeforces.InSearchOfAnEasyProblem;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String ans="EASY";
        for(int e:arr){
            if(e==1){
                ans="HARD";
            }
        }
        System.out.println(ans);
    }
}