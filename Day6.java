import java.util.*;
public class Day6{
    public static void isPowerofTwo(int n){
      if(n<=0) {
       System.out.println("Enter Positive Integer");
       return;}
      
       // binary conditon for power of 2.
      if((n & (n-1))==0) System.out.println("Number is Power of Two.");
      else System.out.println("Number is not Power of Two.");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int n=sc.nextInt();
        isPowerofTwo(n);
    }
}
