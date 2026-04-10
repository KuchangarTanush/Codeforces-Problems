// package Codeforces.VayaTheHipster;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); // red socks
        int b = sc.nextInt(); // blue socks
        
        int differentDays = Math.min(a, b);
        
        int remaining = (a - differentDays) + (b - differentDays);
        
        int sameDays = remaining / 2;
        
        System.out.println(differentDays + " " + sameDays);
    }
}