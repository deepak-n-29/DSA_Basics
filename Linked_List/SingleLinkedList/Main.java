package Linked_List.SingleLinkedList;
import Linked_List.SingleLinkedList.ProblemList.NthFromEnd;
import Linked_List.SingleLinkedList.ProblemList.printMiddleFromList;
import Linked_List.SingleLinkedList.ProblemList.reverseList;
import Linked_List.SingleLinkedList.ProblemList.sortedInsert;

public class Main {
    public static void main(String[] args) {

        linkedList list = new linkedList();
        insertOperations insertOps = new insertOperations();
        deletionOperations deleteOps = new deletionOperations();
        searchOperations searchOps = new searchOperations();

        printMiddleFromList pm = new printMiddleFromList();
        sortedInsert si = new sortedInsert();
        NthFromEnd nth = new NthFromEnd();
        reverseList rl = new reverseList();

        // Insert elements
        insertOps.insertAtHead(list, 10);
        System.out.println("List after inserting 10 at head:");
        list.printList(list.getHead());
        insertOps.insertAtHead(list, 20);
        insertOps.insertAtTail(list, 30);
        insertOps.insertAtPosition(list, 22, 3);
        pm.printMiddle(list);

        System.out.println("List after insertions:");
        list.printList(list.getHead());  // Expected: 20 -> 10 -> 25 -> 30 -> null
        insertOps.insertAtPosition(list, 29, 7); //Index out of bounds, should not insert
        
        System.out.println("recursive print:");
        list.recursivePrintList(list.getHead());
        pm.printMiddle(list);
        pm.efficientPrintMiddle(list.getHead());

        // Delete elements
        deleteOps.deleteAtHead(list);
        System.out.println("List after deleting from head:");
        list.printList(list.getHead());  // Expected: 10 -> 25 -> 30 -> null
        
//
        deleteOps.deleteAtTail(list);
        System.out.println("List after deleting from tail:");
        list.printList(list.getHead());  // Expected: 10 -> 25 -> null

        si.insertSorted(list,11);
        list.printList(list.getHead());
        pm.printMiddle(list);
        pm.efficientPrintMiddle(list.getHead());

//        insertOps.sortedInsert(list,29);
//        list.printList(list.getHead());

//        deleteOps.deleteByValue(list, 25);
//        System.out.println("List after deleting by value 25:");
//        list.printList();  // Expected: 10 -> null

        // Search elements
        System.out.println("Is 10 in the list? " + searchOps.search(list, 10));  // Expected: true
        System.out.println("Is 31 in the list? " + searchOps.search(list, 31));  // Expected: false

        System.out.println("Is 1 in the list? " + searchOps.recursiveSearch(list.getHead(), 1,1));  // Expected: true
        System.out.println("Is 22 in the list? " + searchOps.recursiveSearch(list.getHead(), 22,1));  // Expected: false

        nth.printNthFromEnd(list,2);
        nth.printNthFromEndEfficient(list,2);

        rl.naiveRevlist(list.getHead());
        System.out.print("Reversed List: ");
        list.printList(list.getHead());


        System.out.println(list.getHead().data);

        list.setHead(rl.ERevList(list.getHead()));
        System.out.print("E Reversed List: ");
        list.printList(list.getHead());

        list.setHead(rl.RecRevL(list.getHead()));
        System.out.print("recursive Reversed List: ");
        list.printList(list.getHead());

        list.setHead(rl.RecRevL2(list.getHead(),null));
        System.out.print("recursion2 Reversed List: ");
        list.printList(list.getHead());
    }
}
