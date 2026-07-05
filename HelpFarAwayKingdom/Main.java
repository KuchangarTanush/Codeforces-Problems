// package Codeforces.HelpFarAwayKingdom;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int dot = s.indexOf('.');

        String integerPart = s.substring(0, dot);
        String fractionPart = s.substring(dot + 1);

        char lastDigit = integerPart.charAt(integerPart.length() - 1);

        if (lastDigit == '9') {
            System.out.println("GOTO Vasilisa.");
            return;
        }

        if (fractionPart.charAt(0) < '5') {
            System.out.println(integerPart);
        } else {
            char[] arr = integerPart.toCharArray();
            arr[arr.length - 1]++;
            System.out.println(new String(arr));
        }
    }
}
