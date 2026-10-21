package Linked_List.circularDoublyLinkedList;

public class circularDoublyLinkedList {
    
    Node head;
    Node tail;

    public circularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;    
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void printList(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("(head: "+head.data+")");
    }

    public int getLength() {
        if (head == null) return 0;
        int length = 0;
        Node temp = head;
        do {
            length++;
            temp = temp.next;
        } while (temp != head);
        return length;
    }

    
}
