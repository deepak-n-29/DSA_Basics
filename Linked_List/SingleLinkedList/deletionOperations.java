package Linked_List.SingleLinkedList;

public class deletionOperations {

    public void deleteAtHead(linkedList list){
        if(list.getHead()==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Deleted head node -> "+ list.getHead().data);  
        list.setHead(list.getHead().next); // Move head to the next node
    }

    public void deleteAtTail(linkedList list){          //O(N)
        // Empty list
        if(list.getHead()==null){
            System.out.println("List is empty");
            return;
        }
        // Single node
        if(list.getHead().next==null){
            list.setHead(null);
            System.out.println("Deleted tail node -> " + list.getHead().data);
            return;
        }
        // More than one node
        
        Node temp=list.getHead();
        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println("Deleted tail node -> " + temp.next.data);
        temp.next=null;
    }


    public void deleteAtPos(linkedList list,int pos){   //O(Pos)
        if(list.getHead()==null){
            System.out.println("List is empty.");
            return;
        }
        if(pos<1){
            System.out.println("Invalid position.");
            return;
        }
        if(pos==1){
            deleteAtHead(list);
            return;
        }
        Node temp = list.getHead();
        for(int i=1; i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            System.out.println("Position is out of bound");
            return;
        }
                                                     // t.n->t.n.n       t=1 &&  t.n = 2 && t.n.n=3
        temp.next=temp.next.next;                    //1 -> 2  -> 3    //1 -> 3
    }
}
