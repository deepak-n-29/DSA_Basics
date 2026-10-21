
public class leftRotateByOne {

    static void leftRotateByOne(int arr[], int n) {
        if(n <= 1) return;

        int first = arr[0];
        for(int i=0; i < n-1; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1] = first;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40, 50};
        int n = arr.length;

        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
        leftRotateByOne(arr, n); 
        System.out.println("Array after left rotation by one: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }    
}
