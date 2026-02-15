// package Codeforces.BeautifulMatrix;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int[][]matrix=new int[5][5];
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    int m=0;
    int n=0;
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(matrix[i][j]==1){
                m=i;
                n=j;
                break;
            }
        }
    }
    int ans=Math.abs(m-2)+Math.abs(n-2);
    System.out.println(ans);
}
}
