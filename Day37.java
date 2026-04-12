import java.util.*;
public class Day37 {
    public static int AssignCookies(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr2[j]>=arr1[i]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.print(AssignCookies(arr1,arr2));
    }
}
