import java.util.*;
public class Day3{
    public static boolean isPalindrome(int num){
        int temp=num;
        int n=0;
        while(temp>0){
            int digit=temp%10;
            n=n*10+digit;
            temp/=10;
        }
        return n ==num;
    }
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     if(isPalindrome(n))
        System.out.print("Number is Palindrome");
    else
        System.out.print("Number is not Palindrome");
    }
}