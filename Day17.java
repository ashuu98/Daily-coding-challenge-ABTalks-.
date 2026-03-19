
import java.util.*;
public class Day17{
    public static int countways(int n,int ways[]){
        if(n==0) return 1;
        if(n<0) return 0;

        if(ways[n]!= -1){
            return ways[n];
        }
        ways[n]=countways(n-1,ways)+ countways(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int ways[]=new int[n+1];
        // initilize with -1.
        Arrays.fill(ways,-1);
        System.out.println(countways(n,ways));
    }
}