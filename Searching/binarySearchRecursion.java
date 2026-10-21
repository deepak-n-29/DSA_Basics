package Searching;

import java.util.Scanner;

public class binarySearchRecursion {
    public static int binarySearch(int arr[],int low,int high,int key){
          
        if(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
                return binarySearch(arr, low, high-1, key);
            }
            else{
                return binarySearch(arr, low, high+1, key);
            }
        }
        else{
            return -1;
        }     
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
        int low=0, high=n-1;

        int result = binarySearch(arr,low,high,key);
        if(result == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Elements is present at index " + result);
        }
    }
}

