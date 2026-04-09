import java.util.*;
public class Day35 {
    public static int maxLen(String s){
        int l=0;
        int maxlen=0;
        HashSet<Character> set=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
             set.remove(s.charAt(l));
             l++;
            }
            set.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        System.out.print(maxLen(s));
    }
}
