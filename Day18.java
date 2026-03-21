
import java.util.*;
public class Day18{
    public static boolean validparan(String s){
        Stack<Character> st=new Stack<>();

        if(s.length()%2!=0 ) return false;
        if(s.length()==0) return true;

        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);

            if(p=='(' || p=='[' || p=='{') st.push(p);

            else{
                if(st.isEmpty()) return false;

                if((p==')' && st.peek()=='(' )|| 
                (p==']' && st.peek()=='[') || 
                (p=='}' &&st.peek()=='{')) st.pop();

                else return false;}

                
        }
        return st.isEmpty();
    }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();

    boolean res=(validparan(s))? true : false;
    System.out.println(res);
  }
}