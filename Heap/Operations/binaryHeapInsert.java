package Heap.Operations;

import Heap.BinaryHeap.MinHeap;
import UTIL.swap;
public class binaryHeapInsert {
    
    public void insert(MinHeap heap, int x){
        if(heap.size == heap.capacity){
            return;
        }
        heap.size++;
        heap.arr[heap.size-1] = x;
        
        for(int i=heap.size-1; i!=0 && heap.arr[i] < heap.arr[heap.parent(i)];){
            swap.swap(heap.arr, i, heap.parent(i));
            i = heap.parent(i);
        }
    }
// Purpose: Add element while keeping heap valid.

// Memory sentence
    // “Insert at end → bubble up.”

// Steps
    // 1. Insert at last position
    // 2. While parent is bigger → swap with parent
    // 3. Stop at correct position

}
