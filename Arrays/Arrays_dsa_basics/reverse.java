

public class reverse {
    static void swap(int arr[], int n){
        int low = 0, high = n-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 30, 5};
        int n = arr.length;

        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        swap(arr, n);
        
        System.out.println("\nReversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}