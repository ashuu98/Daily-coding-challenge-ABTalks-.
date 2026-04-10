import java.util.*;
public class Day36{
    public  static int maxWater(int[] height) {
        int maxarea=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int h=Math.min(height[left],height[right]);
            maxarea=Math.max(maxarea,h*(right-left));

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println(maxWater(height));
    }
}