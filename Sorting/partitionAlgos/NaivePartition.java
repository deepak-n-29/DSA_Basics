package Sorting.partitionAlgos;

public class NaivePartition {
    
    static void partition(int arr[], int l, int r, int pivot) {
        int n = arr.length;
        int temp[] = new int[r-l+1];
        int index = 0;
        for(int i=l;i<=r;i++){
            if(arr[i]<arr[pivot] && i!=pivot){
                temp[index++]=arr[i];
            }
        }
        temp[index++]=arr[pivot];

        for(int i=l;i<=r;i++){
            if(arr[i]>arr[pivot]){
                temp[index++]=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 13, 6, 9, 12, 11, 8};
        int n = arr.length;
        partition(arr, 0, n-1, n-1);
        System.out.println("Array after partitioning around pivot " + arr[n-1] + ":");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " "); 
        }
    }    
}
