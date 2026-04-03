// package Codeforces.TheNewYearMeetingFriends;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Median is arr[1]
        int median = arr[1];

        // Calculate total distance
        int distance = Math.abs(arr[0] - median)
                     + Math.abs(arr[1] - median)
                     + Math.abs(arr[2] - median);

        System.out.println(distance);
    }
}