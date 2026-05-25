// package Codeforces.MinutesBeforeNewYear;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int h=sc.nextInt();
            int m=sc.nextInt();
            if(h==23){
                System.out.println(60-m);
            }else{
                int min=(23-h)*60;
                int min1=(60-m);
                System.out.println(min+min1);
            }
        }
    }
}
