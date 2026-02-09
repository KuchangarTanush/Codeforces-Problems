// package Codeforces.Beautifulyear;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    // String a =String.valueOf(Math.abs(y));
    Set<Character>digitset=new HashSet<>();
    // String x=a;
    int ans=0;
    boolean flag=true;
    while(flag){
        digitset.clear();
        String a =String.valueOf(Math.abs(y)+1);
    for(char digit: a.toCharArray()){
        digitset.add(digit);
    }
    if(digitset.size()==a.length()){
        ans=Integer.parseInt(a);
        flag=false;
    }else{
        y++;
    }
}
System.out.println(ans);
}
}
