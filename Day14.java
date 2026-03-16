import java.util.*;
public class Day14 {
    // fist  on reapeting character.
    public static int  firstchar(String s){
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.get(c)==1) return i;
        }
        return -1;

    }
    
    // binary search
    public static int binarysearch(int [] arr,int target){
        int left=0 ,right=arr.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }

    // merge sort
    public static int[] mergesort(int arr1[],int arr2[],int ans[]){

       int i=0,j=0;
       int pos=0;
       while(i<arr1.length && j<arr2.length){
          if(arr1[i]<=arr2[j]) {
            ans[pos]=arr1[i];
            i++;
            pos++;
       } else{
          ans[pos]=arr2[j];
          j++;
          pos++;
       }
    }

    while(i<arr1.length){
        ans[pos]=arr1[i];
        i++;
        pos++;
    }
        while(j<arr2.length){
        ans[pos]=arr2[j];
        j++;
        pos++;
    }
    return ans;
}
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
            // Task 1:- first non repating character
         //String s=sc.next();
         //int idx=firstchar(s);
         //System.out.println(" first non repeating character is:-"+ s.charAt(idx));


         //Task 2:- binary search
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int target=sc.nextInt();
    //    int idex= binarysearch(arr,target);
    //     System.out.println("index is:"+ idex);

        // Task 3:- merge two sorted array
        int arr1[]={5,7,11,13,17};
        int arr2[]={1,3,6,18,19};
        int ans[]=new int[arr1.length+arr2.length];
          mergesort(arr1,arr2,ans);
          for(Integer num : ans){
            System.out.print(num+" ");
          }
     }
}
