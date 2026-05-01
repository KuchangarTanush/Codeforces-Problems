// package Codeforces.PoliceRecruits;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int availablePolice = 0;
        int untreatedCrimes = 0;
        while(t-->0){
            int event=sc.nextInt();
             if (event > 0) {
                // Hiring police officers
                availablePolice += event;
            } else {
                // Crime occurs
                if (availablePolice > 0) {
                    availablePolice--; // Assign officer
                } else {
                    untreatedCrimes++; // No officer available
                }
        }
        }
        System.out.println(untreatedCrimes);
    }
}
