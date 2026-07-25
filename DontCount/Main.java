// package Codeforces.DontCount;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(in);
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(in);
            int m = nextInt(in);
            String x = nextToken(in);
            String s = nextToken(in);

            StringBuilder sb = new StringBuilder(x);
            int ans = 0;
            boolean found = sb.indexOf(s) != -1;

            int cap = 2 * m + n;
            while (!found && sb.length() < cap) {
                sb.append(sb);
                ans++;
                if (sb.indexOf(s) != -1) {
                    found = true;
                }
            }

            result.append(found ? ans : -1).append('\n');
        }

        System.out.print(result);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') b = in.read();
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return ret;
    }

    private static String nextToken(DataInputStream in) throws IOException {
        StringBuilder sb = new StringBuilder();
        int b = in.read();
        while (b == ' ' || b == '\n' || b == '\r') b = in.read();
        while (b != -1 && b != ' ' && b != '\n' && b != '\r') {
            sb.append((char) b);
            b = in.read();
        }
        return sb.toString();
    }
}