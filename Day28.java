import java.util.*;
public class Day28 {
    public static int[] Twosum(int [] arr,int tar){
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<arr.length;i++){
        int req=tar-arr[i];
        if(map.containsKey(req)) return new int[]{map.get(req),i};
        else map.put(arr[i],i);
      }
      return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();

        int ans[]=Twosum(arr,tar);
       System.out.println(ans[0]+" "+ans[1]);
    }
}
