// package Codeforces.AntonAndDanik;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=sc.next();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int v1 = map.getOrDefault('A',0);
        int v2 = map.getOrDefault('D',0);
        if(v1>v2){
            System.out.println("Anton");
        }else if(v2>v1){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
