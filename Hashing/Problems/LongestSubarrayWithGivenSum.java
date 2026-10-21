package Hashing.Problems;
import java.util.*;

// Find the length of the longest subarray with given sum
// Example: arr[] = {10,5,2,7,1,9}, sum = 15
// Output: 4
public class LongestSubarrayWithGivenSum {
    
    static int NaiveMaxlen(int arr[], int n, int sum) { // O(n) time complexity and O(n) space complexity
        int max_len = 0;
        for(int i=0;i<n;i++){
            int curr_sum=0;
            for(int j=i;j<n;j++){
                curr_sum+=arr[j];
                if(curr_sum==sum){
                    max_len = Math.max(max_len, (j - i) + 1);
                }
            }
        }
        return max_len;
    }

    // idea is to use hashmap to store prefix_sum and its index
    // if prefix_sum - sum is found in map, then we found a subarray with given sum
    // update max_len if current length is greater than max_len
    // also handle the case when prefix_sum is equal to sum 
    // then update max_len to i + 1
    // store only first occurrence of prefix_sum in map to get longest length
    // finally return max_len
    // Example: arr[] = {10,5,2,7,1,9}, sum = 15
    // prefix_sum array = {10,15,17,24,25,34}
    // hashmap will look like {10:0,15:1,17:2,24:3,25:4,34:5}
    // when i=3, prefix_sum=24, prefix_sum - sum = 9 is not in map
    // when i=4, prefix_sum=25, prefix_sum - sum = 10 is in map at index 0
    // length = 4 - 0 = 4   
    // max_len = 4
    // when i=5, prefix_sum=34, prefix_sum - sum = 19 is not in map
    // finally return max_len = 4
    static int EfficientMaxlen(int arr[], int n, int sum) { // O(n) time complexity and O(n) space complexity
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int max_len = 0;
        int j;
        for(int i=0;i<n;i++){
            prefix_sum+=arr[i];
            if(prefix_sum==sum){
                max_len = i + 1;
            }
            if(!map.containsKey(prefix_sum)){
                map.put(prefix_sum, i);
            }

            if(map.containsKey(prefix_sum - sum)){
                j= map.get(prefix_sum - sum); // j is previous index where prefix_sum - sum was found
                System.out.println("i: " + i + " j: " + j); 
                max_len = Math.max(max_len, i - j);
            }
        }
        return max_len;
    }

    public static void main(String args[]){
        int arr[] = {10,5,2,7,1,9};
        int n = arr.length;
        int sum = 15;

        System.out.println(NaiveMaxlen(arr, n, sum)); // 4
        System.out.println(EfficientMaxlen(arr, n, sum)); // 4

        int arr2[] = {-5,8,-14,2,4,12};
        int n2 = arr2.length;
        int sum2 = -5;

        System.out.println(NaiveMaxlen(arr2, n2, sum2)); // 5
        System.out.println(EfficientMaxlen(arr2, n2, sum2)); // 5

        int arr3[] = {5,2,3};
        int n3 = arr3.length;
        int sum3 = 5;

        System.out.println(NaiveMaxlen(arr3, n3, sum3)); 
        System.out.println(EfficientMaxlen(arr3, n3, sum3)); 

    }
}
