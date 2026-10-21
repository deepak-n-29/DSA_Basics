package Heap.BinaryHeap;

// Binary Heap
public class MinHeap {

    public int arr[];
    public int size;
    public int capacity;

    public MinHeap(int c){
        this.size = 0; 
        this.capacity = c; 
        this.arr = new int[c];
    }

    public int left(int i) { return (2*i + 1); } 
    public int right(int i) { return (2*i + 2); } 
    public int parent(int i) { return (i-1)/2; } 
    

}

  
