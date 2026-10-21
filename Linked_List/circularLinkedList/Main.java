package Linked_List.circularLinkedList;

public class Main {
    
    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        insertOperation io = new insertOperation();

        cll.setHead(io.insertAtEndOptimized(cll.getHead(), 10));
        cll.setHead(io.insertAtEndOptimized(cll.getHead(), 20));
        cll.setHead(io.insertAtEndOptimized(cll.getHead(), 30));
        cll.setHead(io.insertAtEndOptimized(cll.getHead(), 40));
        cll.setHead(io.insertAtEndOptimized(cll.getHead(), 50));        
        cll.printList_DoWhileLoop(cll.getHead());
        
        System.out.println(cll.getHead().data);
    }

}
