package Linked_List.circularLinkedList;

public class deleteOperation {

    public Node deleteAtBegin(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        Node curr=head;
        while(curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        return head.next;
    }

    public Node deleteAtBeginOptimized(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }

    public Node deleteAtEnd(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=head){
            curr=curr.next;
        }
        curr.next=head;
        return head;
    }

    public Node deleteAtEndOptimized(Node head){
        if(head==null){
            return null;
        }
        if(head.next==head){
            return null;
        }
        head.data=head.next.data;
        head.next=head.next.next;
        return head.next; // return head.next because it is the new head now
    }

    public Node deleteAtPosition(Node head, int pos){
        if(head==null){
            return null;
        }
        if(pos==1){
            return deleteAtBegin(head);
        }
        Node curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
            if(curr==head){
                System.out.println("Invalid position: " + pos);
                return head;
            }
        }
        if(curr.next==head){
            System.out.println("Invalid position: " + pos);
            return head;
        }
        curr.next=curr.next.next;
        return head;
    }
    
}
