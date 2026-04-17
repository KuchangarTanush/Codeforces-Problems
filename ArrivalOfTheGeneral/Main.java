// package Codeforces.ArrivalOfTheGeneral;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxIndex = 0;
        int minIndex = 0;
        
        // Find leftmost maximum
        for(int i = 0; i < n; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Find rightmost minimum
        for(int i = 0; i < n; i++) {
            if(arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }
        
        int swaps = maxIndex + (n - 1 - minIndex);
        
        // If max comes after min → one overlap
        if(maxIndex > minIndex) {
            swaps--;
        }
        
        System.out.println(swaps);
    }
}