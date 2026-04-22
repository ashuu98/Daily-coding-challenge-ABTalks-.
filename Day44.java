
import java.util.*;
public class Day44{
    public static int robber(int house[],int dp[]){
        int n=house.length;
        if(house.length==1) return house[0];

        dp[0]=house[0];
        dp[1]=house[1];
        for(int i=2;i<house.length;i++){
            dp[i]=Math.max(dp[i-2]+house[i],dp[i-1]);
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int house[]=new int[n];
        for(int i=0;i<n;i++){
          house[i]=sc.nextInt();
        }
        int dp[]=new int[n];

        System.out.print(robber(house,dp));
    }
}