package Linked_List.SingleLinkedList.ProblemList;
import Linked_List.SingleLinkedList.linkedList;
import Linked_List.SingleLinkedList.Node;

public class printMiddleFromList {
    //Naive Solution O(N) + O(N/2)
    public void printMiddle(linkedList list){
        Node head = list.getHead();
        int length = list.getLength();
        if(head==null){
            System.out.println("No elements");
            return;
        }
        if(head.next==null){
            System.out.print("Print middle element: ");
            System.out.println(head.data);
            return;
        }

        Node temp = head;
        for(int i=0;i<length/2;i++){
            temp=temp.next;
        }
        System.out.print("Print middle element: ");
        System.out.println(temp.data);
        return;
    }

    // Efficient solution O(N/2)
    // Using two pointers, slow and fast
    // Slow moves one step at a time, fast moves two steps at a time
    public void efficientPrintMiddle(Node head){
        if(head==null){
            System.out.println("No elements");
            return;
        }
        Node slow=head, fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print("Print middle element efficient: ");
        System.out.println(slow.data);

    }
}
