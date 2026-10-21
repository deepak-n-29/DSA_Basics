    

public class leftRotateByD {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void leftRotateByOne(int arr[], int n){
        if(n<=1) return;
        int first = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
    }
    
    // Time Complexity: O(n*d)
    // Space Complexity: O(1)
    static void leftRotateByDUsingleftRotateOne(int arr[], int n, int d) {
        if(d <= 0 || d >= n) return; // No rotation needed if d is 0 or greater than or equal to n
        for(int i=0;i<d;i++){
            leftRotateByOne(arr, n);
        }
    }

    // Time Complexity: O(n*d)
    // Space Complexity: O(d)
    static void leftRotateByD(int arr[], int n, int d) {
        int temp[]= new int[d];

        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr[i]=arr[i+d];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i] = temp[i];
        }
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static void leftRotateByDUsingReverse(int arr[], int n, int d){
        if(d== 0 || d == n) return;
        d = d % n; // In case d is greater than n
        reverse(arr, 0, d-1); // Reverse first d elements
        reverse(arr, d, n-1); // Reverse remaining n-d elements
        reverse(arr, 0, n-1); // Reverse the entire array
    }


    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length; 
        int d = 2; // Number of positions to rotate
        System.out.println("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        leftRotateByOne(arr, n);
        System.out.println("\nArray after left rotation by one: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println("\nArray after left rotation by " + d + ": ");
        leftRotateByD(arr, n, d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }

        System.out.println("\nArray after left rotation by " + d + " using reverse method: ");
        int arr2[] = {10, 20, 30, 40, 50};
        leftRotateByDUsingReverse(arr2, n, d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");    
        }
    }
}
