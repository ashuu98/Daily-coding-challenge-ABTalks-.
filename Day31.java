import java.util.*;
public class Day31{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //sort color
        int start=0;
        int mid=0;
        int end=n-1;
        while(mid<=end){
            if(arr[mid]==0){
                int t1=arr[start];
                arr[start]=arr[mid];
                arr[mid]=t1;
                mid++;
                start++;
            }else if(arr[mid]==1) mid++;

            else{
                int t2=arr[end];
                arr[end]=arr[mid];
                arr[mid]=t2;
                end--;
            }
        }

        for(Integer c:arr){
            System.out.print(c+" ");
        }
    }
}