package Heap.Operations;

import Heap.BinaryHeap.MinHeap;
import UTIL.swap;

public class heapify {
    public static void heapifyRec(MinHeap heap, int i){ // Time Complexity: O(logn) Aux Space: O(logn)
        int lt = heap.left(i);
        int rt = heap.right(i);
        int smallest = i;
        if(lt < heap.size && heap.arr[lt] < heap.arr[i]){ // Check left child exists (lt < heap.size) and left child is smaller
            smallest = lt;
        }
        if(rt < heap.size && heap.arr[rt] < heap.arr[smallest]){ // Check right child exists (rt < heap.size) and right child is smaller
            smallest = rt;
        }
        if(smallest != i){ // If smallest is not root
            swap.swap(heap.arr, i, smallest);
            heapifyRec(heap, smallest);
        }
    }

    public static void heapifyIterative(MinHeap heap, int i){ // Time Complexity: O(logn) space complexity: O(1)
        while(i < heap.size){
            int lt = heap.left(i);
            int rt = heap.right(i);
            int smallest = i;
            if(lt < heap.size && heap.arr[lt] < heap.arr[i]){ // Check left child exists (lt < heap.size) and left child is smaller
                smallest = lt;
            }
            if(rt < heap.size && heap.arr[rt] < heap.arr[smallest]){ // Check right child exists (rt < heap.size) and right child is smaller
                smallest = rt;
            }
            if(smallest == i){
                break;
            }
            swap.swap(heap.arr, i, smallest);
            i = smallest;
        }
    }
}


// Purpose: Fix heap property at index i.

// Memory sentence //
    // 1. “Compare parent with children → swap with smallest → repeat.”

// Steps //
    // 1. Find left & right child
    // 2. Find smallest among parent + children
    // 3. If parent is not smallest → swap
    // 4. Continue downward

// 👉 Used by buildHeap, extractMin, deleteKey