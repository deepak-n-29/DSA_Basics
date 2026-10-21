package Linked_List.circularDoublyLinkedList;

public class insertOperation {
 
    public Node insertAtBegin(Node head, int data){
        Node newNode = new Node(data);

        if(head==null){
            newNode.next=newNode;
            newNode.prev=newNode;
            return newNode;
        }
        Node tail=head.prev;

        newNode.next=head;
        newNode.prev=tail;
        tail.next=newNode;
        head.prev=newNode;

        return newNode;
    }

    public Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        if(head==null){
            newNode.next=newNode;
            newNode.prev=newNode;
            return newNode;
        }
        Node tail=head.prev;

        newNode.next=head;
        newNode.prev=tail;
        tail.next=newNode;
        head.prev=newNode;

        return head;
    }

    public Node insertAtPosition(Node head, int data, int position){
        if(position==1){
            return insertAtBegin(head, data);
        }

        Node newNode = new Node(data);
        if(head==null){
            newNode.next=newNode;
            newNode.prev=newNode;
            return newNode;
        }

        Node curr=head;
        int count=1;
        while(count<position-1){
            curr=curr.next;
            if(curr==head) break; // if position is greater than length of list
            count++;
        }

        Node nextNode=curr.next;

        newNode.next=nextNode;
        newNode.prev=curr;
        curr.next=newNode;
        nextNode.prev=newNode;

        return head;
    }

}
