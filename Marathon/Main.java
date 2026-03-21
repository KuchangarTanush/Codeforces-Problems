// package Codeforces.Marathon;
import java.util.*;
public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    StringBuilder sb=new StringBuilder();
    while(t-->0){
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int count=0;
    if(b>a){
        count+=1;
    }if(c>a){
        count+=1;
    }if(d>a){
        count+=1;
    }
    sb.append(Integer.toString(count)).append("\n");

}
    System.out.println(sb);
    }
}