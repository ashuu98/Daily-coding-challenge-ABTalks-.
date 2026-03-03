import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }

        // prefix array
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }

        for(Integer num:arr){
            System.out.print(num+" ");
        }
    }
}
