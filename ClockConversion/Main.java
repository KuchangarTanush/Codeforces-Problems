// package Codeforces.ClockConversion;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String time = sc.next();
            String[] part = time.split(":");
            int hrs = Integer.parseInt(part[0]);
            String min = part[1];
            String period;
            if (hrs >= 12) {
                period = "PM";
                if (hrs > 12) {
                    hrs -= 12;
                }
            } else {
                period = "AM";
                if (hrs == 0) {
                    hrs = 12;
                }
            }
            System.out.printf("%02d:%s %s%n", hrs, min, period);
        }
        sc.close();
    }
}
