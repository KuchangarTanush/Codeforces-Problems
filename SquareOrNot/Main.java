// package Codeforces.SquareOrNot;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int k=(int)Math.sqrt(n);
            if(k*k!=n){
                System.out.println("No");
                continue;
            }
            boolean ok =true;
            for(int i=0;i<k && ok;i++){
                for(int j=0;j<k;j++){
                    char ch=s.charAt(i*k+j);
                    if (i == 0 || j == 0 || i == k - 1 || j == k - 1) {
                        if (ch != '1') {
                            ok = false;
                            break;
                        }
                    } else {
                        if (ch != '0') {
                            ok = false;
                            break;
                        }
                    }
                }
            }
            System.out.println(ok ? "Yes" : "No");
        }
    }
}
