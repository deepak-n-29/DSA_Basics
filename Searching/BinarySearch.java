package Searching;
import java.util.Scanner;

//Complexity is O(Logn) 
//Search a sorted array by repeatedly dividing the search interval in half
//it follows binary tree
//Binary search is a powerful algorithm for finding elements in a sorted array efficiently. 
//Its logarithmic time complexity makes it suitable for large datasets, and its implementation is straightforward. 

public class BinarySearch {

    public static int binarySearch(int arr[],int n,int key){
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        sc.close();

        int result = binarySearch(arr,arr.length,key);
        if(result == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Elements is present at index " + result);
        }
    }
}
