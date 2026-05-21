// package Codeforces.ProblemSolvingLog;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int[]freq=new int[26];

            // Count frequency of each problem
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'A']++;
            }

            int solved = 0;

            // Check if enough time was spent
            for (int i = 0; i < 26; i++) {
                if (freq[i] >= i + 1) {
                    solved++;
                }
            }

            System.out.println(solved);
        }
    }
}
