// package Codeforces.Homework;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            
            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();
            
            Deque<Character> dq = new ArrayDeque<>();
            
            // Initialize deque with string a
            for (char ch : a.toCharArray()) {
                dq.addLast(ch);
            }
            
            // Process each character
            for (int i = 0; i < m; i++) {
                char ch = b.charAt(i);
                
                if (c.charAt(i) == 'V') {
                    dq.addFirst(ch); // Vlad → front
                } else {
                    dq.addLast(ch);  // Dima → end
                }
            }
            
            // Build final string
            StringBuilder result = new StringBuilder();
            for (char ch : dq) {
                result.append(ch);
            }
            
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}