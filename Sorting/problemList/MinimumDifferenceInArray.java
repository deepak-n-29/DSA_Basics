package Sorting.problemList;
import java.util.Arrays;


// Problem: Find the minimum difference between any two elements in an array. 
// Example: Input: [4, 1, 7, 9, 12, 56] Output: 2 (difference between 7 and 9)
// Approaches:
// 1. Naive Approach: Compare each element with every other element to find the minimum difference. (O(n^2) time complexity)
// 2. Sorted Approach: Sort the array and then find the minimum difference between consecutive elements. (O(n log n) time complexity)

public class MinimumDifferenceInArray {
    
    public static int naiveMinDiff(int arr[]){ //O(n^2) approach
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                minDiff = Math.min(minDiff, Math.abs(arr[i]-arr[j]));
            }
        }
        return minDiff;
    }

    public static int sortedMinDiff(int arr[]){ //O(n log n) approach
        int n = arr.length;
        // Sorting the array
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            minDiff = Math.min(minDiff, Math.abs(arr[i]-arr[i-1]));
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 9, 12, 56};
        System.out.println("Minimum Difference using Naive Approach: " + naiveMinDiff(arr));
        System.out.println("Minimum Difference using Sorted Approach: " + sortedMinDiff(arr));
    }
}
