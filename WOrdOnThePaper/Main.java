// package Codeforces.WOrdOnThePaper;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            char[][] grid = new char[8][8];

            // Read input
            for (int i = 0; i < 8; i++) {
                String line = sc.next();
                for (int j = 0; j < 8; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }

            // Find the word
            for (int col = 0; col < 8; col++) {
                StringBuilder word = new StringBuilder();

                for (int row = 0; row < 8; row++) {
                    if (grid[row][col] != '.') {
                        word.append(grid[row][col]);
                    }
                }

                // If we found a word in this column
                if (word.length() > 0) {
                    System.out.println(word.toString());
                    break;
                }
            }
        }
        sc.close();
    }
}