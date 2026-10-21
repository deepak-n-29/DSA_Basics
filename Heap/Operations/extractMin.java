package Heap.Operations;

import Heap.BinaryHeap.MinHeap;


public class extractMin {
    
    public static int extractMin(MinHeap heap){ // Time Complexity: O(logn)
        
        if(heap.size == 0){
            return -1;
        }
        if(heap.size == 1){
            heap.size--;
            return heap.arr[0];
        }

        int min = heap.arr[0];
        heap.arr[0] = heap.arr[heap.size-1];
        heap.size--;
        heapify.heapifyRec(heap, 0);
        return min;
    }
}

// Purpose: Remove smallest element.

// Memory sentence
    // 1. “Replace root with last → heapify down.”

// Steps
    // 1. Save root (min)
    // 2. Move last element to root
    // 3. Reduce size
    // 4. Heapify from root