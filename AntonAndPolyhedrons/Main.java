// package Codeforces.AntonAndPolyhedrons;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        int ans=0;
        while(t-->0){
            String a=sc.next();
            if(a.equals("Tetrahedron")){
                ans+=4;
            }else if(a.equals("Cube")){
                ans+=6;
            }else if(a.equals("Octahedron")){
                ans+=8;
            }else if(a.equals("Dodecahedron")){
                ans+=12;
            }else if(a.equals("Icosahedron")){
                ans+=20;
            }
        }
        System.out.println(ans);
    }
}