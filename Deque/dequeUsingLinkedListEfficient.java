package Deque;

public class dequeUsingLinkedListEfficient {
    private class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    private Node front, rear;
    private int size;

    public dequeUsingLinkedListEfficient() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() { return size == 0; }

    void insertFront(int x) {
        Node node = new Node(x);
        if (isEmpty()) front = rear = node;
        else {
            node.next = front;
            front.prev = node;
            front = node;
        }
        size++;
    }

    void insertRear(int x) {
        Node node = new Node(x);
        if (isEmpty()) front = rear = node;
        else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        size++;
    }

    int deleteFront() {
        if (isEmpty()) throw new RuntimeException("Deque empty");
        int val = front.data;
        front = front.next;
        if (front != null) front.prev = null;
        else rear = null; // became empty
        size--;
        return val;
    }

    int deleteRear() {
        if (isEmpty()) throw new RuntimeException("Deque empty");
        int val = rear.data;
        rear = rear.prev;
        if (rear != null) rear.next = null;
        else front = null;
        size--;
        return val;
    }

    int getFront() { 
        if (isEmpty()) throw new RuntimeException("Deque empty"); 
        return front.data; 
    }

    int getRear()  { 
        if (isEmpty()) throw new RuntimeException("Deque empty"); 
        return rear.data; 
    }

    int size() { return size; }

    public static void main(String[] args) {
        dequeUsingLinkedListEfficient deque = new dequeUsingLinkedListEfficient(); 
        deque.insertRear(10); 
        deque.insertRear(20);
        deque.insertFront(5);
        System.out.println("Front: " + deque.getFront()); // 5
        System.out.println("Rear: " + deque.getRear());   // 20
        System.out.println("Deleted from front: " + deque.deleteFront()); // 5
        System.out.println("Deleted from rear: " + deque.deleteRear());   // 20
        System.out.println("Size: " + deque.size()); // 1
    }
}

// Time Complexity: O(1) for all operations
// Space Complexity: O(n) where n is the number of elements in the deque
// This implementation uses a doubly linked list to achieve efficient insertions and deletions from both ends of the deque.
