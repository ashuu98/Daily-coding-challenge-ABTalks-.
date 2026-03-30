
import java.util.*;
public class Day26 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
           this.next=next;
        }
    }
    public static Node Removefromlast(Node head,int k){
     
        Node dummy=new Node(0);
        dummy.next=head;
        Node fast=head;
        Node slow=head;
        while(k>0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
     public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;

        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            Node newnode=new Node(data);
            if(head==null ){
                head=tail=newnode;
            }else{
                tail.next=newnode;
                tail=newnode;
            }
        }
        int k=sc.nextInt();
         Node newhead=Removefromlast(head,k);
         printList(newhead);

    }
}