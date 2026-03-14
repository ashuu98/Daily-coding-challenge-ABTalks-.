import java.util.*;
public class Day11{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       
       int n=s.length()-1;
       String rev="";
       for(int i=n;i>=0;i--){
        rev+=s.charAt(i);
       }
       System.out.println(rev);
    }
}