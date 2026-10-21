package Linked_List.SingleLinkedList;

public class linkedList {
    private Node head;

    public linkedList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    public void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public void recursivePrintList(Node head){
        if(head==null){
            System.out.println("Recursive print: null");
            return;
        }
        System.out.print(head.data + "->");
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
