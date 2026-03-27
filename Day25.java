
import java.util.*;

public class Day25{
    static class Node{
    int data;
    Node next;
     Node(int data){
        this.data=data;
        this.next=null;
    }
}

public static boolean iscycle(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow== fast) return true;
    }
    return false;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
     Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        tail.next=head.next.next;

        if(iscycle(head))
            System.out.println("cycle exist");
        else{
            System.out.println("not exist");
        }
    }
}