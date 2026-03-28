// package Codeforces.FileName;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int count = 0;
        int removals = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'x') {
                count++;
                if (count >= 3) {
                    removals++;
                }
            } else {
                count = 0; // reset when not 'x'
            }
        }
        
        System.out.println(removals);
    }
}