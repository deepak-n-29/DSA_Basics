package Sorting;


// 20, 5, 40, 60, 10, 30

public class InsertionSort {
    public static void insertionSort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        insertionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
