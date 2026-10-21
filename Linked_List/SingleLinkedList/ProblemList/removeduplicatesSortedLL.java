package Linked_List.SingleLinkedList.ProblemList;
import Linked_List.SingleLinkedList.Node;


public class removeduplicatesSortedLL {
 
    public void removeDuplicate(Node head){ //O(N)
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
    }
}
