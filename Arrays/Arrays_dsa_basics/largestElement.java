// In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Find the Largest Number in an Array !!!
// Our Task: Given an array arr[ ] of size n, the task is to find the largest element in the given array. 
 
// Example: 

// Input: arr[] = {10, 20, 4} // Output: 20
// Input: arr[] = {20, 10, 20, 4, 100} // Output: 100

public class largestElement {
    // Naive Approach
    public int largestElementNaive(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    max=arr[j];
                }
            }
        }
        return max;
    }
    // Efficient Approach
    public int largestElementEfficient(int arr[],int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }



    
    // Main method to test the functionality
    public static void main(String[] args) {
        largestElement le = new largestElement();
        int arr1[] = {10, 20, 4};
        int n1 = arr1.length;
        System.out.println("Largest Element (Naive): " + le.largestElementNaive(arr1, n1));
        System.out.println("Largest Element (Efficient): " + le.largestElementEfficient(arr1, n1));

        int arr2[] = {20, 10, 20, 4, 100};
        int n2 = arr2.length;
        System.out.println("Largest Element (Naive): " + le.largestElementNaive(arr2, n2));
        System.out.println("Largest Element (Efficient): " + le.largestElementEfficient(arr2, n2));
    }
}