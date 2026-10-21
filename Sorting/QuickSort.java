package Sorting;

import Sorting.partitionAlgos.LomutoPartition;

public class QuickSort {
    
    static int lpartition(int arr[], int l, int r) {
        LomutoPartition lp = new LomutoPartition();
        return lp.partition(arr, l, r);
    }


    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[], int l, int r) {
        if (r > l) {

            int pivot = lpartition(arr, l, r);
            sort(arr, l, pivot - 1);
            sort(arr, pivot + 1, r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {62, 3, 91, 5, 24, 87};
        int n = arr.length;

        int l = 0, r = n - 1;
        sort(arr, l, r);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
