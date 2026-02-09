// package Codeforces.HelpFullMaths;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split("\\+");
        Arrays.sort(words);
        // System.out.println(words);
        for(int i=0;i<words.length;i++){
            if(i<words.length-1){
                System.out.print(words[i]+'+');
            }
            else{
                System.out.print(words[i]);
            }
        } 
    }
}
