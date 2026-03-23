import java.util.*;
public class Day21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];

        for(int i=n-1;i>=0;i--){
            int elem=arr[i];

            while(!st.isEmpty() && st.peek()<=elem) {
                st.pop();}
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(elem);
        }

        for(Integer num:ans){
            System.out.print(num+" ");
        }
    }
}
