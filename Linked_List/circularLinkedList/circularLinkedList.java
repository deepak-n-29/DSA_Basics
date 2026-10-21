package Linked_List.circularLinkedList;

public class circularLinkedList {
    Node head;

    public circularLinkedList(){
        this.head=null;
    }

    public Node getHead() {
        return head;
    }   
    public void setHead(Node head) {
        this.head = head;
    }

    //Do while loop is used to print circular linked list
    public void printList_DoWhileLoop(Node head){
        if(head==null) return;
        Node temp=head;
        do{
            System.out.print(temp.data +"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("(head)");
    }

    public void printList_ForLoop(Node head){
        if(head == null) return;
        System.out.print(head.data + "->");
        for(Node temp = head.next; temp!=head; temp=temp.next){
            System.out.print(temp.data + "->");
        }
    }


    
}
