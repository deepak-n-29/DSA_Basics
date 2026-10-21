package Sorting.partitionAlgos;

public class LomutoPartition {
    
    public int partition(int arr[], int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return (i + 1);
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        LomutoPartition lp = new LomutoPartition();
        int arr[] = {5, 13, 6, 9, 12, 11, 8};
        int n = arr.length;
        int pivotIndex = lp.partition(arr, 0, n - 1);
        System.out.println("Array after partitioning around pivot " + arr[pivotIndex] + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
