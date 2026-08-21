// package Codeforces.TeamOlympiad;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> programmers = new ArrayList<>();
        ArrayList<Integer> mathematicians = new ArrayList<>();
        ArrayList<Integer> sportsmen = new ArrayList<>();

        // Store the index of each student according to their skill
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();

            if (t == 1) {
                programmers.add(i);
            } else if (t == 2) {
                mathematicians.add(i);
            } else {
                sportsmen.add(i);
            }
        }

        // The smallest group determines the maximum number of teams
        int teams = Math.min(
                programmers.size(),
                Math.min(mathematicians.size(), sportsmen.size())
        );

        System.out.println(teams);

        // Create teams using one student from each group
        for (int i = 0; i < teams; i++) {
            System.out.println(
                    programmers.get(i) + " " +
                    mathematicians.get(i) + " " +
                    sportsmen.get(i)
            );
        }

        sc.close();
    }
}