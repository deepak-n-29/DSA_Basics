package Linked_List.doublyLinkedList;

public class insertOperation {
    
    public Node insertAtBegin(Node head, int data){
        Node newNode = new Node(data);
        if(head==null) return newNode;
        newNode.next=head;
        head.prev=newNode;
        return newNode;
    } 

    public Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head==null) return newNode;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
        return head;
    }
}
