
import java.util.*;
public class Day22{
    class queue{
     static Stack<Integer> st1=new Stack<>();
     static Stack<Integer> st2=new Stack<>();
    // add Tc:-O(n)
    public static void add(int n){
       if(st1.isEmpty()){
        st1.push(n);
       }
      else{ while(!st1.isEmpty()){
        st2.push(st1.pop());
       }
       st1.push(n);
       while(!st2.isEmpty()){
        st1.push(st2.pop());
       }
    }
    }
    // remmove
    public static int remove(){
       return st1.pop();
    }
    // peek
    public static int peek(){
       return st1.peek();
    }

    // is empty
    public static boolean isEmpty(){
        if(st1.isEmpty()) return true;
        return false; 
    }

}

    public static void main(String[] args) {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();
        System.out.println(queue.peek()+" ");

        while(!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }

    }
}