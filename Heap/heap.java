package Heap;

import Heap.BinaryHeap.MinHeap;
import Heap.Operations.binaryHeapInsert;
import Heap.Operations.decreaseKeyAndDeleteKey;
import Heap.Operations.extractMin;
public class heap {

    public static void printHeap(MinHeap heap){
        for(int i=0; i<heap.size; i++){
            System.out.print(heap.arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        binaryHeapInsert insertOp = new binaryHeapInsert();
        insertOp.insert(heap, 10);
        insertOp.insert(heap, 20);
        insertOp.insert(heap, 100);
        insertOp.insert(heap, 30);
        insertOp.insert(heap, 40);
        insertOp.insert(heap, 70);
        insertOp.insert(heap, 50);
        insertOp.insert(heap, 60);
        insertOp.insert(heap, 80);
        insertOp.insert(heap, 90);
        
        printHeap(heap);

        System.out.println();
        int min = extractMin.extractMin(heap);
        System.out.println(min + " ");


        printHeap(heap);

        System.out.println();
        decreaseKeyAndDeleteKey.deleteKey(heap, 2);

        printHeap(heap);

        

       

    }
}
