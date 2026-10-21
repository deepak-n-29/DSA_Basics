package Linked_List.SingleLinkedList;

public class searchOperations {

    //Naive solution
    public boolean search(linkedList list, int data) {
        int pos = 1;
        Node temp = list.getHead();
        while (temp != null) {
            if (temp.data == data) {
                System.out.print("(Search operation) Position of the element " + pos+ " and ");
                return true;
            }
            pos++;
            temp = temp.next;
        }
        return false;
    }

    public boolean recursiveSearch(Node head, int data,int pos) {
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            System.out.print("(Search operation) Position of the element " + pos + " and ");
            return true;
        }
        return recursiveSearch(head.next,data,pos+1);
    }


}
