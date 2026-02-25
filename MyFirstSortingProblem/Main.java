// package Codeforces.MyFirstSortingProblem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>=y){
                sb.append(y +" "+x).append("\n");
            }else{
                sb.append(x+" "+y).append("\n");
            }
        }
        System.out.println(sb);
    }
}
