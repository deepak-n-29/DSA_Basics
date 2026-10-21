package Heap.Operations;

import Heap.BinaryHeap.MinHeap;

public class buildHeap {
    public static void buildHeap(MinHeap heap){ // Time Complexity: O(n)
        for(int i=heap.size/2-1; i>=0; i--){
            heapify.heapifyRec(heap, i);
        }
    }
}

// Purpose: Convert a random array into a valid Min-Heap.

// Memory sentence
    // 1. “Heapify from last non-leaf to root.”

// Why?
    // Leaves are already heaps
    // First non-leaf index = n/2 - 1
    // Fix heap property bottom-up

// Steps
    // 1. Start from index n/2 - 1
    // 2. Call heapify
    // 3. Move backward till index 0