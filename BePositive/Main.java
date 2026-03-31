// package Codeforces.BePositive;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int neg = 0, zero = 0;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                
                if (x == -1) neg++;
                else if (x == 0) zero++;
            }
            
            int operations = 0;
            
            // Step 1: Convert all zeros to 1
            operations += zero;
            
            // Step 2: If negatives are odd → fix one -1
            if (neg % 2 != 0) {
                operations += 2;
            }
            
            System.out.println(operations);
        }
        
        sc.close();
    }
}