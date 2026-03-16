
import java.util.*;
public class Day13{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();

        int i=s.length()-1;
        int len=0;
            // remove the extra space at last.
          while(i>=0 && s.charAt(i)==' '){
              i--;
          }
          while(i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
          }
        
        System.out.print(len);
    }
}