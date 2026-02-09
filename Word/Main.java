
import java.util.*;
public class Main{
    public static String Mixword(String word){
        int upper=0,lower=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else{
                lower++;
            }
        }
        if(upper>lower){
            return word.toUpperCase();
        }
        else{
            return word.toLowerCase();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String ans=Mixword(word);
        System.out.println(ans);
        sc.close();
        
    }
}