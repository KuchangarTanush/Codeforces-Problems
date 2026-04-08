// package Codeforces.DieRoll;
import java.util.*;

public class Main {
    
    // Function to find GCD
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Y = sc.nextInt();
        int W = sc.nextInt();
        
        int max = Math.max(Y, W);
        
        int favorable = 7 - max; // outcomes where Dot wins
        int total = 6;
        
        int gcd = gcd(favorable, total);
        
        favorable /= gcd;
        total /= gcd;
        
        System.out.println(favorable + "/" + total);
    }
}