package DSA_Basics.Stack;
import DSA_Basics.Linked_List.SingleLinkedList.Node;

public class StackUsingLinkedList {
    // INSERT AT FRONT and REMOVE FROM FRONT
    // This implementation uses a singly linked list to represent the stack.
    
    
    Node head; // Pointer to the top of the stack
    int size;
    public StackUsingLinkedList() {
        head = null; // Initialize the stack as empty
        size = 0; // Initialize the size of the stack
    }

    public void push(int x){
        Node temp = new Node(x); // Create a new node with the given value
        temp.next = head; // Link the new node to the previous top
        head = temp; // Update the top of the stack to the new node
        size++; // Increment the size of the stack
        System.out.println(x + " pushed onto stack");
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Return -1 if the stack is empty
        }
        int poppedValue = head.data; // Get the value of the top node
        head = head.next; // Update the top of the stack to the next node
        size--; // Decrement the size of the stack
        System.out.println(poppedValue + " popped from stack");
        return poppedValue; // Return the popped value
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return -1 if the stack is empty
        }
        System.out.println(head.data + " is the top element");
        return head.data; // Return the value of the top node
    }

    // Returns the number of elements in the stack
    public int size() {
        return size;
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.peek(); // Should print 30
        
        stack.pop(); // Should remove 30
        stack.peek(); // Should print 20
        
        System.out.println("Current size of stack: " + stack.size()); // Should print 2
        
        stack.pop(); // Should remove 20
        stack.pop(); // Should remove 10
        stack.pop(); // Should print "Stack Underflow"
    }
    

}
