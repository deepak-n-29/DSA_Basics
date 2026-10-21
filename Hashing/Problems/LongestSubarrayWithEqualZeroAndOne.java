package Hashing.Problems;

import java.util.HashMap;

public class LongestSubarrayWithEqualZeroAndOne {
    
    static int longestSub(int arr[], int n){ 
        int res = 0;
        for(int i=0;i<n;i++){
            int c0=0,c1=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0) c0++;   // count of zeroes
                else c1++;          // count of ones
                if(c0==c1){             // when count of zeroes and ones are equal
                    res = Math.max(res, c0+c1);  // update the result with maximum length
                }
            }
        }
        return res;
    }

    static int longestSubEfficient(int arr[], int n){

        for(int i=0;i<n;i++){
            arr[i] = (arr[i]==0)?-1:1;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0, maxlen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxlen=i+1;
            }

            if(map.containsKey(sum+n)){
                int length = map.get(sum+n);
                if(maxlen < i - length){
                    maxlen = i - length;
                }
            }
            else{
                map.put(sum+n,i);
            }
        }
        return maxlen;
    }


    public static void main(String args[]){
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        int len = arr.length;
        
        System.out.println(longestSub(arr,len));

        
        System.out.println(longestSubEfficient(arr,len));

    }

}
