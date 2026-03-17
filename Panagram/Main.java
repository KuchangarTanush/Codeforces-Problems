// package Codeforces.Panagram;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character>set=new HashSet<>();
        int n=sc.nextInt();
        String s=sc.next();
        String s1=s.toLowerCase();
        for (char c : s1.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        if(set.size()==26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
