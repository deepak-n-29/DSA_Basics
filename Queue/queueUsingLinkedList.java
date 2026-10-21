package Queue;
import Linked_List.SingleLinkedList.Node;

public class queueUsingLinkedList { // insert at end and remove from front
    
    private Node front, rear; // Pointers to the front and rear of the queue
    int size; // Current size of the queue
    public queueUsingLinkedList() {
        front = null; // Initialize the front of the queue as null
        rear = null; // Initialize the rear of the queue as null
        size = 0; // Initialize the size of the queue       
    }

    public boolean isEmpty() {
        return front == null; // Queue is empty if front is null
    }

    public void size() {
        System.out.println("Current size of queue: " + size);
    }

    public void insertAtTail(int x){
        Node newNode = new Node(x);
        if(rear==null){
            front=rear=newNode;
        }
        else{
            rear.next = newNode; // Link the new node at the end of the queue
            rear = newNode; // Update the rear pointer to the new node
        }
        size++; // Increment the size of the queue
        System.out.println(x + " inserted into queue");
    }

    public void removeFromFront(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;
        }
        int removedValue = front.data; // Get the value of the front node
        front = front.next; // Move the front pointer to the next node
        if(front == null) {
            rear = null; // If the queue is now empty, set rear to null
        }
        size--; // Decrement the size of the queue
        System.out.println(removedValue + " removed from queue");
    }

    public static void main(String[] args) {
       
        queueUsingLinkedList queue = new queueUsingLinkedList();
        
        queue.insertAtTail(10);
        queue.insertAtTail(20);
        queue.insertAtTail(30);
        
        queue.size(); // Should print current size of the queue
        
        queue.removeFromFront(); // Should remove 10
        queue.removeFromFront(); // Should remove 20
        
        queue.size(); // Should print current size of the queue

    }
}