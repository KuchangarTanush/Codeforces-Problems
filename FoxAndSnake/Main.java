// package Codeforces.FoxAndSnake;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean right = true; // controls direction
        
        for (int i = 1; i <= n; i++) {
            
            if (i % 2 == 1) {
                // Odd row → full '#'
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else {
                // Even row
                if (right) {
                    // '#' at last position
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    // '#' at first position
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                }
                right = !right; // flip direction
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}