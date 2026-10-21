package Hashing.Problems;
import java.util.*;
public class SubarrayWithGivenSum {

    static boolean subarrayWithGivenSumNaive(int arr[], int n, int sum) { // O(n^2) time complexity and O(1) space complexity
        for(int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<n;j++){
                curr_sum+=arr[j];
                if(curr_sum==sum){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean subarrayWithGivenSumEfficient(int arr[], int n, int sum) { // O(n) time complexity and O(n) space complexity
        HashSet<Integer> set = new HashSet<>();
        int prefix_sum = 0;
        for(int i=0;i<n;i++){
            prefix_sum += arr[i];
            if(prefix_sum==sum || set.contains(prefix_sum-sum)){ // prefix_sum - sum = previous prefix_sum 
                return true;
            }
            set.add(prefix_sum);
        }
        return false;
    }

    public static void main(String args[]){
        
        int arr[] = {5,8,6,13,3,-1}; // subarray with sum 22 is present {8,6,13,-1} // HashSet will look like {5,13,19,32,35,34} // here prefix_sum - sum = 32 - 22 = 10 is present in set
        int n = arr.length;
        int sum = 22;
        System.out.println(subarrayWithGivenSumNaive(arr, n, sum)); // true
        System.out.println(subarrayWithGivenSumEfficient(arr, n, sum)); // true
        

        int arr2[] = {4, 2, 0, 1, 6}; // subarray with sum 6 is present {6} or {4,2,0} // HashSet will look like {4,6,6,7,13} // here prefix_sum - sum = 6 - 6 = 0 is present in set
        int n2 = arr2.length;
        int sum2 = 6;
        System.out.println(subarrayWithGivenSumNaive(arr2, n2, sum2)); // true
        System.out.println(subarrayWithGivenSumEfficient(arr2, n2, sum2)); // true

        // Negative Case 
        int arr3[] = {1,2,3}; // no subarray with sum 7 is present // HashSet will look like {1,3,6} // here prefix_sum - sum = 6 - 7 = -1 is not present in set
        int n3 = arr3.length;
        int sum3 = 7;
        System.out.println(subarrayWithGivenSumNaive(arr3, n3, sum3)); // false
        System.out.println(subarrayWithGivenSumEfficient(arr3, n3, sum3)); // false

    }
    
    
}
