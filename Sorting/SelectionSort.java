package Sorting;

// Finding the minimum element in Unsorted array and swap it with element at beginning.

public class SelectionSort {

    static void naiveSelectionSort(int arr[]){
        int n = arr.length;
        int sortedArr[] = new int[n];
        for(int i=0;i<n;i++){
            int smallestIndex=0;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[smallestIndex]){
                    smallestIndex=j;
                }
            }
            sortedArr[i]=arr[smallestIndex];
            arr[smallestIndex]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            arr[i]=sortedArr[i];
        }
    }
    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            swap(arr, i, smallest);
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int arr1[] = { 64, 34, 25, 12, 22, 11, 90 };
        selectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
        naiveSelectionSort(arr1);
        System.out.println("Sorted array using naive approach");
        printArray(arr1);
    }
}
