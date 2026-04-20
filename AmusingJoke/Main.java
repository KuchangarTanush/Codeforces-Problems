// package Codeforces.AmusingJoke;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.next();
        String host = sc.next();
        String pile = sc.next();

        String combined = guest + host;

        // Quick length check (important optimization)
        if (combined.length() != pile.length()) {
            System.out.println("NO");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters from guest + host
        for (char ch : combined.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Subtract using pile
        for (char ch : pile.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("NO");
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        // Final check
        if (map.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
