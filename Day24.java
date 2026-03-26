import java.util.*;

public class Day24 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeList(Node head1,Node head2){
       
        Node temp1=head1;
        Node temp2=head2;
        Node dummy=new Node(0);
        Node temp3=dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.data<=temp2.data){
               temp3.next=temp1;
               temp1=temp1.next;
            }else{
               temp3.next=temp2;
               temp2=temp2.next;
            }
            temp3=temp3.next;
        }
        while(temp1!=null){
            temp3.next=temp1;
            temp1=temp1.next;
            temp3=temp3.next;
        }
        while(temp2!=null){
            temp3.next=temp2;
            temp2=temp2.next;
            temp3=temp3.next;
        }
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
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int n2 = sc.nextInt();

        Node headd = null, taill = null;

        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            Node newNodee = new Node(val);

            if (headd == null) {
                headd = taill = newNodee;
            } else {
                taill.next = newNodee;
                taill = newNodee;
            }
        }

         Node finalhead=mergeList(head,headd);
         printList(finalhead);
    }
}
