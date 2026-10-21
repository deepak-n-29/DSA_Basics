package Linked_List.SingleLinkedList.ProblemList;
import Linked_List.SingleLinkedList.Node;


import java.util.ArrayList;

public class reverseList {

    //TC: Two traversal: O(n)
    //Aux Space: O(n)
    public Node naiveRevlist(Node head){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(Node curr=head; curr!=null; curr=curr.next){
            arr.add(curr.data);
        }
        for(Node curr=head; curr!=null; curr=curr.next){
            curr.data = arr.remove(arr.size()-1);
        }
        return head;
    }

    //TC: O(n)
    //Aux Space: O(1)
    // 3 pointers: curr, prev, next
    public Node ERevList(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    //Time Complexity: O(n)
    //Space Complexity: O(n) Function call stack space is used in Recursion
     public Node RecRevL(Node head){
        if(head==null||head.next==null) return head;
        Node rest_head=RecRevL(head.next);
        head.next.next = head;
        head.next = null;
        return rest_head;
     }

    //Time Complexity: O(n)
    //Space Complexity: O(n)
      public Node RecRevL2(Node curr, Node prev){
        if(curr==null) return prev;
        Node next = curr.next;
        curr.next.next = prev;
        return RecRevL2(next, curr);
      }

}
