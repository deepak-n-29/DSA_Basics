package Heap.Operations;

import Heap.BinaryHeap.MinHeap;
import UTIL.swap;

public class decreaseKeyAndDeleteKey {
    
    public static void decreaseKey(MinHeap heap, int i, int x){ // Time Complexity: O(logn)
        heap.arr[i] = x;
        while(i != 0 && heap.arr[i] < heap.arr[heap.parent(i)]){
            swap.swap(heap.arr, i, heap.parent(i));
            i = heap.parent(i);
        }
    }
    // Purpose: Reduce value of a node.

    // Memory sentence
        // 1. “Decrease value → bubble up.”

    // Why bubble up?
        // Smaller value may violate heap property upward


    public static void deleteKey(MinHeap heap, int i){ // Time Complexity: O(logn)
        decreaseKey(heap, i, Integer.MIN_VALUE);
        extractMin.extractMin(heap);
    }
    
    // Purpose: Remove any element.

    // Memory sentence
        // “Make it −∞ → extract min.”

    // Steps
        // Decrease key to -∞
        // Extract min (it will come to root and be removed)
}
