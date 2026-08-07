// package Codeforces.VanyaAndCubes;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int level = 0;
        int need = 0;
        int total = 0;
        while (true) {
            level++;
            need += level;
            total += need;
            if (total > n) {
                System.out.println(level - 1);
                break;
            }
        }
    }
}
