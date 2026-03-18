
import java.util.*;
public class Day16{
    public static int fibonnaci(int n){
        if(n ==0 || n==1) return n;

        return fibonnaci(n-1)+ fibonnaci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
         System.out.print(fibonnaci(i)+" ");}
    }
}