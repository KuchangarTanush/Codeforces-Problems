// package Codeforces.IWannaBeTheGuy;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // total levels
        Set<Integer> set = new HashSet<>();
        // Levels Little X can pass
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            set.add(sc.nextInt());
        }
        // Levels Little Y can pass
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            set.add(sc.nextInt());
        }
        // Check if all levels from 1 to n are covered
        boolean canPassAll = true;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                canPassAll = false;
                break;
            }
        }
        if (canPassAll) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}