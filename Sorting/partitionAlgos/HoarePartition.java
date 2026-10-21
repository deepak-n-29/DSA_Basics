package Sorting.partitionAlgos;

public class HoarePartition {

    public int partition(int arr[], int l, int r) {
        int pivot = arr[l];
        int i = l - 1;
        int j = r + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            swap(arr, i, j);
        }
    }   
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        HoarePartition hp = new HoarePartition();
        int arr[] = {5, 3,8,4,2,7,1,10};
        int n = arr.length;
        int pivotIndex = hp.partition(arr, 0, n - 1);
        System.out.println("Array after partitioning around pivot " + arr[pivotIndex] + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
