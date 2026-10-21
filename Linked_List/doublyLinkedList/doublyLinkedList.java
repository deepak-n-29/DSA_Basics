package Linked_List.doublyLinkedList;

public class doublyLinkedList {
    
    Node head;
    Node tail;

    public doublyLinkedList() {
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
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void recursivePrintList(Node head){
        if(head==null){
            System.out.println("Recursive print: null");
            return;
        }
        System.out.print(head.data + "<->");
        recursivePrintList(head.next);
    }

    public int getLength() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

}