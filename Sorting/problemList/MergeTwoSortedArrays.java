package Sorting.problemList;

import java.util.Arrays;

// Problem: Merge two sorted arrays into a single sorted array.
// Example: Input: arr1 = [1, 3, 5], arr2 = [2, 4, 6] Output: [1, 2, 3, 4, 5, 6]
// Approaches:
// 1. Naive Approach: Combine both arrays and then sort the resulting array. (O((n+m) log(n+m)) time complexity)
// 2. Efficient Approach: Use two pointers to merge the arrays in a single pass. (O(n+m) time complexity)

public class MergeTwoSortedArrays {
    
    public static void naiveMerge(int arr1[], int arr2[], int n, int m){ //O((n+m) log(n+m)) approach
        int mergedArr[] = new int[n+m];
        int k=0;
        for(int i: arr1){
            mergedArr[k++]=i;
        }
        for(int j: arr2){
            mergedArr[k++]=j;
        }
        Arrays.sort(mergedArr);
        System.out.println("Merged Array using Naive Approach: ");
        for(int i=0;i<mergedArr.length;i++){
            System.out.print(mergedArr[i]+" ");
        }
    }

    public static void efficientMerge(int arr1[], int arr2[], int n, int m){ //O(n+m) approach
        int mergedArr[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                mergedArr[k++]=arr1[i++];
            }else{
                mergedArr[k++]=arr2[j++];
            }
        }
        while(i<n){
            mergedArr[k++]=arr1[i++];
        }
        while(j<m){
            mergedArr[k++]=arr2[j++];
        }
        System.out.println("Merged Array using Efficient Approach: ");
        for(int p=0;p<mergedArr.length;p++){
            System.out.print(mergedArr[p]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};
        int n = arr1.length;
        int m = arr2.length;
        naiveMerge(arr1, arr2, n, m);
        System.out.println();
        efficientMerge(arr1, arr2, n, m);
    
    }
}
