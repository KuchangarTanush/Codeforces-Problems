// package Codeforces.ConsecutiveSumRiddle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long l = -n + 1;
            long r = n;
            sb.append(l).append(' ').append(r).append('\n');
        }
        
        System.out.print(sb);
    }
}
