package Linked_List.SingleLinkedList.ProblemList;
import Linked_List.SingleLinkedList.Node;
import Linked_List.SingleLinkedList.linkedList;

public class sortedInsert {
    public void insertSorted(linkedList list, int data){
        Node head = list.getHead();
        Node newNode=new Node(data);

        //Empty list or inserting at the head
        if(head==null){
            list.setHead(newNode);
            System.out.println("sorted Insert");
            return;
        }

        // Inserting at the head
        // If the new data is less than or equal to the head's data
        if(data<=head.data){
            newNode.next = head;
            list.setHead(newNode);
            System.out.println("Sorted Insert: inserted at head");
            return;
        }

        // Inserting in the middle or at the tail
        // Traverse the list to find the correct position
        Node curr = head;
        while(curr.next!=null && curr.next.data<data){
            curr=curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        System.out.println("Sorted Insert: inserted after value " + curr.data);
    }
}
