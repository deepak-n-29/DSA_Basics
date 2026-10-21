package Linked_List.doublyLinkedList;

public class reverseDoublyll {

    public Node reverseDoublyLinkedList(Node head){
        if( head==null || head.next==null) return head;
        Node curr=head;
        Node prev=null;

        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr = curr.prev;
        }

        return prev.prev;
    }
    
}
