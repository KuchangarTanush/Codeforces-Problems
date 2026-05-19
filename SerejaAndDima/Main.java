// package Codeforces.SerejaAndDima;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        int sreeja=0;
        int dima=0;
        int left=0;
        int right=arr.length-1;
        int turn=0;
        while(left<=right){
            int value;
            if(arr[left]>arr[right]){
                value=arr[left];
                left++;
            }else{
                value=arr[right];
                right--;
            }
            if(turn%2==0){
                sreeja+=value;
            }else{
                dima+=value;
            }
            turn++;
        }
        System.out.println(sreeja+" "+dima);
    }
}
