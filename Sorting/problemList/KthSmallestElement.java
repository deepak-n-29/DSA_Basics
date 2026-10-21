package Sorting.problemList;
import java.util.Arrays;

import Sorting.partitionAlgos.LomutoPartition;

public class KthSmallestElement {

    public static int kthSmallest(int arr[], int n, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
 
    // QuickSelect method
    // working: https://www.geeksforgeeks.org/quickselect-algorithm/
    public static int kthSmallestUsingQuickSelect(int arr[], int n, int k) {
        int l = 0, r = n - 1;
        while(l<=r){
            int p = new LomutoPartition().partition(arr, l, r);
            if(p == k-1){
                return arr[p];
            }
            else if(p < k-1){
                l = p + 1;
            }
            else{
                r = p - 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int n = arr.length;
        int k = 3;
        int result = kthSmallest(arr, n, k);
        System.out.println(k + "th smallest element is: " + result);

        int arr2[] = {7, 10, 4, 3, 20, 15};
        int n2 = arr2.length;
        int k2 = 3;
        int result2 = kthSmallestUsingQuickSelect(arr2, n2, k2);
        System.out.println(k2 + "th smallest element using QuickSelect is: " + result2);
    }
    
}
