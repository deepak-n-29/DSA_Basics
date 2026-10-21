package Linked_List.SingleLinkedList.ProblemList;
import Linked_List.SingleLinkedList.linkedList;
import Linked_List.SingleLinkedList.Node;

public class NthFromEnd {

    //O(n) - traverse twice
    public void printNthFromEnd(linkedList list, int n){
        Node temp=list.getHead();
        int length = list.getLength();
        if(temp==null){
            System.out.println("No elements");
            return;
        }
        if(n > length || n<1){
            System.out.println("Invalid value of N: " + n);
            return;
        }

        for(int i=1;i<length-n+1;i++){
            temp=temp.next;
        }
        System.out.println(n + "th node from the end (Naive method) is: " + temp.data);
    }

    //O(n) - traverse once
    public void printNthFromEndEfficient(linkedList list, int n){
        Node fast=list.getHead();
        Node slow=list.getHead();

        if(list.getHead()==null){
            System.out.println("No elements");
            return;
        }

        for(int i=0;i<n;i++){
            if(fast==null){
                System.out.println("Invalid value of N: " + n);
                return;
            }
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(n + "th node from the end (Efficient method) is: " + slow.data);
    }
}
