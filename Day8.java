import java.util.*;
public class Day8 {
    public static int size(int num){
        int s=0;
        while(num>0){
            num/=10;
            s++;
        }
        return s;
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      int count=0;
      for(Integer num :arr){
        if(size(num)%2==0) count++;
      }
      System.out.println("Number of even length digit:-"+count);
  }  
}
