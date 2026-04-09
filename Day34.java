
import java.util.*;
public class Day34{
    public static double MaxAvgSum(int arr[],int k){
       double sum=0;
       for(int i=0;i<k;i++){
        sum+=arr[i];
       }
       int a=0,b=k-1;
       double max=sum;
       while(b<arr.length-1){
        sum=sum+arr[b+1]-arr[a];
        max=Math.max(sum,max);
        a++; b++;
       }
       return  max/k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(MaxAvgSum(arr,k));
    }
}