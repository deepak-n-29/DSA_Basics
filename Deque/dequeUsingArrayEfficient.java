package Deque;

public class dequeUsingArrayEfficient {
    int front, rear, size, capacity;
    int []arr;
    dequeUsingArrayEfficient(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.front=0;
        this.rear=capacity-1;
        arr=new int[capacity];
    }

    boolean isFull()  { return size==capacity; }
    boolean isEmpty() { return size==0; }

    void insertFront(int item){ 
        if(isFull()){
            System.out.println("Deque Overflow");
            return;
        }
        front = (front - 1 + capacity) % capacity; // Circular decrement
        arr[front]=item;
        size++;
        System.out.println(item+" inserted at front");
    }

    void insertRear(int item){
        if(isFull()){
            System.out.println("Deque Overflow");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear]=item;
        size++;
        System.out.println(item+" inserted at rear");
    }

    void deleteFront(){
        if(isEmpty()){
            System.out.println("Deque Underflow");
            return;
        }
        int item=arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println(item+" deleted from front");
    }

    void deleteRear(){
        if(isEmpty()){
            System.out.println("Deque Underflow");
            return;
        }
        int item=arr[rear];
        rear = (rear - 1 + capacity) % capacity; // Circular decrement
        size--;
        System.out.println(item+" deleted from rear");
    }

    void peekFront(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(arr[front]+" is at front of Deque");
    }   

    void peekRear(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(arr[rear]+" is at rear of Deque");
    }

    int size(){ return size; }

    int capacity(){ return capacity; }

    public static void main(String[] args) {
        dequeUsingArrayEfficient deque = new dequeUsingArrayEfficient(5);

        deque.insertRear(10);  // 10 null null null null         rear = (rear + 1) % capacity; 4+1 % 5 = 0

        deque.insertRear(20);  // 10 20 null null null        rear = (rear + 1) % capacity;  0+1 % 5 = 1
        deque.insertFront(5);  // 5 10 20 null null     front = (front - 1 + capacity) % capacity;  0-1+5 % 5 = 4
         deque.insertFront(22);  // 22 5 10 20 null   front = (front - 1 + capacity) % capacity; 4-1+5 % 5 = 3
        deque.peekFront(); // Should print 22
        deque.peekRear();  // Should print 20
        System.out.println("Size: " + deque.size()); // Should print 4

        deque.deleteFront(); // removes 22, now 5 10 20 null null   front = (front + 1) % capacity; 3+1 % 5 = 4
        deque.deleteFront(); // removes 5, now 10 20 null null null   front = (front + 1) % capacity; 4+1 % 5 = 0
        deque.peekFront(); // Should print 10
        System.out.println("Size: " + deque.size());    // Should print 2

        deque.deleteRear();    // removes 20, now 10 null null null null   rear = (rear - 1 + capacity) % capacity; 1-1+5 % 5 = 0
        deque.peekRear();   // Should print 10
        System.out.println("Size: " + deque.size());    // Should print 1

        deque.deleteFront();    // removes 10, now null null null null null   front = (front + 1) % capacity; 0+1 % 5 = 1
        System.out.println("Is Deque empty? " + deque.isEmpty()); // Should print true
    }
    //visualize the circular nature of the array
    // use modulo operation to wrap around the indices
    // front and rear pointers move in a circular manner
    // Efficient insertions and deletions at both ends
    // example: capacity=5
    // initial: front=0, rear=4 pointer positions
    // insertRear(10): front=0, rear=0 -> [10, null, null, null, null]
    // insertRear(20): front=0, rear=1 -> [10, 20, null, null, null]
    // insertFront(5): front=4, rear=1 -> [10, 20, null, null, 5]
    // insertFront(22): front=3, rear=1 -> [10, 20, null, 22, 5]
    // deleteFront(): front=4, rear=1 -> [10, 20, null, null, 5]
    // deleteFront(): front=0, rear=1 -> [null, 20, null, null, 5]
    // deleteRear(): front=0, rear=0 -> [null, null, null, null, 5]
    // deleteFront(): front=1, rear=0 -> [null, null, null, null, null]   
    
    // use case of deque
    // 1. Palindrome Checker
    // 2. Sliding Window Maximum
    // 3. Task Scheduling   

    // use of deque is inserting and deleting elements from both ends efficiently
    // access rand
}
