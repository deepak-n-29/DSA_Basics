package Hashing.Problems;

import java.util.*;
import java.util.stream.Collectors;

public class CountDistinctElements {

    // For each element, check all earlier elements to see if it has appeared before; if not, count it as a distinct element.
    static int countDistinct(int arr[],int n){ //Time Complexity O(n^2)
        int res = 0;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                res++;
            }
        }
        return res;
    }

    static int EfficientCountDistinct(int arr[], int n){ //TC: θ(n), Aux Space: O(n)
        // Set<Integer> s = new HashSet<Integer>();
        // for(int i=0;i<n;i++){
        //     s.add(arr[i]);
        // }

        Set<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        return s.size();
    }



      public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        System.out.println(countDistinct(arr, n));
        System.out.println(EfficientCountDistinct(arr, n));

    }

    
}
