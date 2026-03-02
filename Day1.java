
// Two sum problem.

import java.util.*;
public class Day1 {
    public static int[] twosum(int arr[],int target){
        
        HashMap<Integer,Integer> map=new HashMap<>();
       
        for(int i=0;i<arr.length;i++){
           int val=target-arr[i];
           if(map.containsKey(val)){
              int ans[]={map.get(val),i};
              return ans;
           }else{
            map.put(arr[i],i);
           }
        }
        return new int []{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target");
        int target=sc.nextInt();
        System.out.println("enter length of Array");
        int arrlen=sc.nextInt();
        int arr[]=new int[arrlen];
        System.out.println("Eneter Elements");
        for(int i=0;i<arrlen;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println( "Indexs are:-" + Arrays.toString(twosum(arr,target)));
    }
}
