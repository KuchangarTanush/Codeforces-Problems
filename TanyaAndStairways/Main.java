// package Codeforces.TanyaAndStairways;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (a[i] == 1) {
                ans.add(a[i - 1]);
            }
        }

        ans.add(a[n - 1]);

        System.out.println(ans.size());
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
