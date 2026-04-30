// package Codeforces.GoodKid;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            arr.set(0,arr.get(0)+1);
            int mul=1;
            for(int num:arr){
                mul*=num;
            }
            System.out.println(mul);
        }
    }
}
