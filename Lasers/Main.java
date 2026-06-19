// package Codeforces.Lasers;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st.nextToken(); // x
            st.nextToken(); // y

            // consume horizontal lasers
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                st.nextToken();
            }

            // consume vertical lasers
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                st.nextToken();
            }

            ans.append(n + m).append('\n');
        }

        System.out.print(ans);
    }
}