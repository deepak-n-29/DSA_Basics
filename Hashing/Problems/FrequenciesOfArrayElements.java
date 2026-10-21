package Hashing.Problems;
import java.util.*;
public class FrequenciesOfArrayElements {

    static void printFreqNaive(int arr[], int n){ // Time Complexity: O(n^2)
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]) {
                    flag=true;
                    break;
                }
            }
            if(flag==true) continue;
            int freq = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i] +" : "+freq);

        }
    }

    static void printFreqEfficient(int arr[], int n){ 
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1 );
            }
        }
        for(Map.Entry<Integer,Integer> itr: map.entrySet()){
            System.out.println(itr.getKey()+" "+itr.getValue());
        } 
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 10};
        int n= arr.length;

        System.out.println();
        System.out.println("NAIVE");
        printFreqNaive(arr, n);
        System.out.println();
        System.out.println("Efficient");
        printFreqEfficient(arr, n);
    }


    
}
