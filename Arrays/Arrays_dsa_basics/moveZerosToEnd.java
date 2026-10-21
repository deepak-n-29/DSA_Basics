public class moveZerosToEnd {
 
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void moveZerosToEnd(int arr[], int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr, i, count);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int n = arr.length;

        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        moveZerosToEnd(arr, n);

        System.out.println("Array after moving zeros to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
