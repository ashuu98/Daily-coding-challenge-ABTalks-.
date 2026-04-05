
import java.util.*;
public class Day29{
    public static int[] Topk(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        for(int key:map.keySet()){
           pq.add(key);
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        int answer[]=Topk(arr,k);
        for(Integer a:answer){
            System.out.print(a+" ");
        }
    }
}