package Hashing.Problems;
import java.util.*;

public class SubarrayWithZeroSum {

    static boolean isZeroSumSubarrayNaive(int arr[], int n) { // O(n^2) time complexity
        for(int i=0;i<n;i++){
            int curr_sum = 0;
            for(int j=i;j<n;j++){
                curr_sum +=arr[j];
                if(curr_sum == 0){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isZeroSumSubarrayEfficient(int arr[], int n) { //using prefix sum and hashing O(n) time complexity
        HashSet<Integer> set = new HashSet<>();
        int prefix_sum = 0;
        for(int i=0;i<n;i++){
            prefix_sum +=arr[i];
            if(prefix_sum == 0 || set.contains(prefix_sum)){
                return true;
            }
            set.add(prefix_sum);
        }
        return false; 
    }

    public static void main(String args[]){
        int arr[] = {4, 2, -3, 1, 6};
        int n = arr.length;

        System.out.println(isZeroSumSubarrayNaive(arr, n)); // true
        System.out.println(isZeroSumSubarrayEfficient(arr, n)); // true

        int arr2[] = {4, 2, 0, 1, 6};
        int n2 = arr2.length;
        System.out.println(isZeroSumSubarrayNaive(arr2, n2)); // true
        System.out.println(isZeroSumSubarrayEfficient(arr2, n2)); // true

        // Edge Case
        int arr3[] = {3,-1,-2,5}; // 3 + (-1) + (-2) = 0 // set looks like {3,2,0,5} // here 0 is present where condition is either prefix_sum == 0 or set.contains(prefix_sum)
        int n3 = arr3.length;
        System.out.println(isZeroSumSubarrayNaive(arr3, n3)); // true
        System.out.println(isZeroSumSubarrayEfficient(arr3, n3)); // true

        // Negative Case 
        int arr4[] = {1,2,3};
        int n4 = arr4.length;
        System.out.println(isZeroSumSubarrayNaive(arr4, n4)); // false
        System.out.println(isZeroSumSubarrayEfficient(arr4, n4)); // false
      

        
    }
}
