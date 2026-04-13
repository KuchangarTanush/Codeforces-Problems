// package Codeforces.VanyaAndFence;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of friends
        int h = sc.nextInt(); // fence height

        int totalWidth = 0;

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();

            if (height > h) {
                totalWidth += 2; // person bends
            } else {
                totalWidth += 1; // normal walk
            }
        }

        System.out.println(totalWidth);
    }
}