
import java.util.*;
public class Day7{
    public static int Buyandsell(int days[]){
        int maxprofit=Integer.MIN_VALUE;
        Stack<Integer> st=new Stack<>();
        st.push(days[0]);
        for(int i=1;i<days.length;i++){

            // for min buy cost
            int curr=days[i];
            if(curr<st.peek()){
                st.pop();
                st.push(curr);
            }else{
                int profit=days[i]-st.peek();
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int days[]=new int[n];
        for(int i=0;i<n;i++){
            days[i]=sc.nextInt();
        }
        System.out.println(Buyandsell(days));
    }
}
