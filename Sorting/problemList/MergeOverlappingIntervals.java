package Sorting.problemList;
import java.util.*;


// Merge Overlapping Intervals
// Given a collection of intervals, merge all overlapping intervals.
// Input1: intervals = [[1,3],[2,4],[5,7],[6,8]]
// Output1: [[1,4],[5,8]]
// Input2: intervals = [[7,9],[6,10],[4,5],[1,3],[2,4]]
// Output2: [[1,5],[6,10]]
// Approach: Sort the intervals based on the starting time. Then, iterate through the sorted intervals and merge them if they overlap.


class Interval implements Comparable<Interval> {
    int start;
    int end;

    Interval(int s, int e) {
        this.start = s;
        this.end = e;           
    }

    @Override
    public int compareTo(Interval other) {
        return this.start - other.start;  
    }
}

public class MergeOverlappingIntervals { 

    static void mergeIntervals(Interval arr[], int n){  // Time Complexity: O(nlogn) due to sorting, Space Complexity: O(1)
        Arrays.sort(arr); // Sort intervals based on start time
        
        int res = 0;
        for(int i=1;i<n;i++){
            if(arr[res].end >= arr[i].start){
                arr[res].end = Math.max(arr[res].end, arr[i].end); // Merge
            }
            else{
                res++;
                arr[res] = arr[i];
            }
        }

        System.out.println("Merged Intervals:");
        for(int i=0;i<=res;i++){
            System.out.println("[" + arr[i].start + ", " + arr[i].end + "]");
        }   
    }

    public static void main(String[] args) {
        Interval arr[] = {new Interval(5,10), 
                          new Interval(3,15), 
                          new Interval(18,30), 
                          new Interval(2,7)};
        int n = arr.length;

        mergeIntervals(arr,n);
    }
    
}
