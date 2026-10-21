package Deque;

class DequeUsingArrayNaive{
    int size, capacity;
    int []arr;
    DequeUsingArrayNaive(int capacity){
        this.capacity=capacity;
        this.size=0;
        arr=new int[capacity];
    }

    boolean isFull()  { return size==capacity; }
    boolean isEmpty() { return size==0; }

    void insertFront(int item){ 
        if(isFull()){
            System.out.println("Deque Overflow");
            return;
        }
        for(int i=size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=item;
        size++;
        System.out.println(item+" inserted at front");
    }

    void insertRear(int item){
        if(isFull()){
            System.out.println("Deque Overflow");
            return;
        }
        arr[size]=item;
        size++;
        System.out.println(item+" inserted at rear");
    }

    void deleteFront(){
        if(isEmpty()){
            System.out.println("Deque Underflow");
            return;
        }
        int item=arr[0];
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        System.out.println(item+" deleted from front");
    }

    void deleteRear(){
        if(isEmpty()){
            System.out.println("Deque Underflow");
            return;
        }
        int item=arr[size-1];
        size--;
        System.out.println(item+" deleted from rear");
    }

    void getFront(){
        if(isEmpty()){ 
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(arr[0]+" is at the front of the deque");
    }

    void getRear(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(arr[size-1]+" is at the rear of the deque");
    }

    int size()     { return size; }
    int capacity() { return capacity; }

    void display(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque elements: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeUsingArrayNaive deque = new DequeUsingArrayNaive(5);
        deque.insertRear(10);  // 10 null null null null 
        deque.insertRear(20);  // 10 20 null null null
        deque.insertFront(5);  // 5 10 20 null null
        deque.display();            // 5 10 20
        deque.getFront();           // 5
        deque.getRear();            // 20
        deque.deleteFront();        // 10 20 null null null
        deque.display();            // 10 20
        deque.deleteRear();         // 10 null null null null
        deque.display();            // 10
    }
}