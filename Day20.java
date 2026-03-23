
import java.util.*;
public class Day20 {
    public static boolean isNumber(String s) {
    try {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<n;i++){
            if(isNumber(s[i])){
                st.push(Integer.parseInt(s[i]));
            }else{
                int b=st.pop();
                int a=st.pop();
                int res = 0;

        if(s[i].equals("+")) res = a + b;
        else if(s[i].equals("-")) res = a - b;
        else if(s[i].equals("*")) res = a * b;
        else if(s[i].equals("/")) res = a / b;

        st.push(res);
        }
    }
        System.out.println(st.pop());

    }
}