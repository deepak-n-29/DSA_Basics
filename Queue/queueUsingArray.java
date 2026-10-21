package Queue;

class queueUsingArray { // insert at end and remove from front

    private int front, rear, size, capacity;
    private int[] array;

    public queueUsingArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = capacity - 1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item){
        if(isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        array[rear] = item; // Add the new item at the rear
        size++;
        System.out.println(item + " enqueued to queue");
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        int item = array[front]; // Get the front item
        front = (front + 1) % capacity; // Circular increment // Move front to the next position
        size--;
        System.out.println(item + " dequeued from queue");
    }

    public void peekFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(array[front] + " is at the front of the queue");
    }

    public void peekRear() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(array[rear] + " is at the rear of the queue");
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
        
        queueUsingArray queue = new queueUsingArray(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.peekFront(); // Should print 10
        queue.peekRear(); // Should print 30
        
        queue.dequeue(); // Should remove 10
        queue.peekFront(); // Should print 20
        queue.dequeue(); // Should remove 20
        queue.peekFront(); // Should print 30   
        queue.dequeue(); // Should remove 30
        queue.peekFront(); // Should indicate queue is empty
        queue.dequeue(); // Should print "Queue Underflow"

        System.out.println("Current size of queue: " + queue.size()); // Should print 0
        queue.peekFront(); // Should indicate queue is empty
        queue.peekRear(); // Should indicate queue is empty 
    }
    
}