package Linked_List.circularLinkedList;

public class insertOperation {
    
    public Node insertAtBegin(Node head, int data){

        Node newNode = new Node(data);
        if(head==null){
            newNode.next=newNode;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=head;
        return newNode;
    }

    public Node insertAtBeginOptimized(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next=newNode;
        }
        newNode.next=head.next;
        head.next=newNode;
        int temp=head.data;
        head.data=newNode.data;
        newNode.data=temp;
        return head;
    }

    public Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next=newNode;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.next=head;
        return head;
    }

    public Node insertAtEndOptimized(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next=newNode;
            return newNode;
        }
        newNode.next=head.next;
        head.next=newNode;

        int temp=head.data;
        head.data=newNode.data;
        newNode.data=temp; // swap data of head and newNode 
        return newNode; // return newNode because it is the new head now
    }
}
