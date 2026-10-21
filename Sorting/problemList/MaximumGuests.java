package Sorting.problemList;
import java.util.*;
// Meet Maximum Guests
// Given arrival and departure times of all guests, find the time at which maximum guests are present.
// Approach: Sort both arrival and departure arrays. Use two pointers to traverse both arrays and find the maximum number of guests at any time.

// input: arrival[] = {900, 940, 950, 1100, 1500, 1800}, departure[] = {910, 1200, 1120, 1130, 1900, 2000}
// output: 3 at time 1100 there are maximum guests present 940, 950, 1100 arrived and departed at 1200, 1120, 1130

public class MaximumGuests {

    static int maxGuests(int arrival[], int departure[], int n){ // Time Complexity: O(nlogn) due to sorting, Space Complexity: O(1)
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i=1, j=0, res=1, curr=1;
        while(i<n && j<n){
            if(arrival[i]<=departure[j]){
                curr++;
                i++;
                res = Math.max(res, curr);
                System.out.println("Current Guests: " + curr + " at time " + arrival[i-1]);
            }
            else{
                curr--;
                j++;
                System.out.println("Current Guests: " + curr + " at time " + departure[j-1]);
            }
        }
        return res;
        
    }
    
    public static void main(String[] args) {
        
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;

        int result = maxGuests(arrival, departure, n);
        System.out.println("Maximum number of guests present at any time: " + result);
    }
}
