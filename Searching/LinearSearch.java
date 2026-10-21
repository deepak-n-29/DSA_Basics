package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[],int n, int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
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

        int result = linearSearch(arr,arr.length,key);
        if(result == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Elements is present at index " + result);
        }
    }
}
