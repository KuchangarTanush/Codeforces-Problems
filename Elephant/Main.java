// package Codeforces.Elephant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int steps;
        if (x % 5 == 0) {
            steps = x / 5;
        } else {
            steps = (x / 5) + 1;
        }
        
        System.out.println(steps);
    }
}