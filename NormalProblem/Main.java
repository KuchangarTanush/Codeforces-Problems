// package Codeforces.NormalProblem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            StringBuilder sb=new StringBuilder();
            for(int i=a.length()-1;i>=0;i--){
                if(a.charAt(i)=='p'){
                    sb.append('q');
                }else if(a.charAt(i)=='q'){
                    sb.append('p');
                }else{
                    sb.append('w');
                }
            }
            System.out.println(sb);
        }
       
    }
}
