import java.util.*;
public class Day5{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Positive Digit");
        int n=sc.nextInt();
        int opr=0;
        while(n>0){
            if(n%2==0){
                n/=2;
            }else{
                n-=1;
            }
           opr++;
        }
        System.out.println("Total number of steps taken:-"+opr);
    }
}