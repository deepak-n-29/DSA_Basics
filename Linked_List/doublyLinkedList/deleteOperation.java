package Linked_List.doublyLinkedList;

public class deleteOperation {

    public Node deleteAtHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
        return head;
    }

    public Node deleteAtTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.prev.next=null;
        temp.prev=null;
        return head;
    }
}
