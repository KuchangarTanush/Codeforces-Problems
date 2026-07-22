// package Codeforces.FalseAlarm;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int first = -1, last = -1;

for (int i = 0; i < n; i++) {
    int a = sc.nextInt();

    if (a == 1) {
        if (first == -1)
            first = i;
        last = i;
    }
}

if (last - first + 1 <= x)
    System.out.println("YES");
else
    System.out.println("NO");
        }

    }
}
