import java.util.*;
public class Day9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int curr=arr[0];
        for(int i=1;i<n;i++){
             curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }
}
