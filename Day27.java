import java.util.*;
public  class Day27{
    public static boolean ContainDuplicate(int [] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
           if(map.containsKey(n)){
            int j=map.get(n);
            if(Math.abs(i-j)<=k){
                return true;
            }else{
               map.put(n,i);
               continue;
            }
           }else{
            map.put(n,i);
           }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(ContainDuplicate(arr,k));
    }
}