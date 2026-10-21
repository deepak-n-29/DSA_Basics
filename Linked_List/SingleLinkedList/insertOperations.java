package Linked_List.SingleLinkedList;

public class insertOperations {

    public void insertAtHead(linkedList list, int data){
        Node newNode= new Node(data);
        newNode.next=list.getHead();
        list.setHead(newNode);
    }

    public void insertAtTail(linkedList list, int data){
        Node newNode = new Node(data);
        if(list.getHead()==null){
            list.setHead(newNode);
            return;
        }

        Node temp=list.getHead();
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertAtPosition(linkedList list,int data,int pos){
        Node newNode= new Node(data);

        if(pos==1){
            newNode.next=list.getHead();
            list.setHead(newNode);
            return;
        }

        Node temp = list.getHead();

        for(int i=1;i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("Index out of bounds, cannot insert at position " + pos);
            return; // Index out of bounds
        }
        
        // standard insert
        newNode.next=temp.next;
        temp.next=newNode;     
    }

}
