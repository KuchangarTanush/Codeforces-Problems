// package Codeforces.IsYourHorseshoeOrHoof;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer>color=new HashSet<>();
        for(int i=0;i<=3;i++){
            color.add(sc.nextInt());
        }
        int res=4-color.size();
        System.out.println(res);
    }
}
