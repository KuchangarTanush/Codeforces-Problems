// package Codeforces.DiverseTeam;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] visited = new boolean[101];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int rating = sc.nextInt();
            if (!visited[rating]) {
                visited[rating] = true;
                ans.add(i);
            }
        }

        if (ans.size() < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            for (int i = 0; i < k; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}

