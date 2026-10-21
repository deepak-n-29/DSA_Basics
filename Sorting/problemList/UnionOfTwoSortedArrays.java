package Sorting.problemList;
import java.util.Arrays;

// Union of two sorted arrays
// Given two sorted arrays, find their union and print the union in sorted order.
// Example:
// Input:
// arr1[] = {3, 5, 8}
// arr2[] = {2, 8, 9, 10, 15}
// Output:
// Union is {2, 3, 5, 8, 9, 10, 15}  

public class UnionOfTwoSortedArrays {

    public static void union(int a[],int b[],int m, int n){ // time complexity O(mn)
        int c[]=new int[m+n];
        for(int i=0;i<m;i++){
            c[i]=a[i];
        }
        for(int i=0;i<n;i++){
            c[i+m]=b[i];
        }
        Arrays.sort(c);
        for(int i=0;i<(m+n);i++){
            if(i>0 && c[i]!=c[i-1]){
                System.out.println(c[i]);
            }
        }
    }

    public static void EfficientUnion(int a[],int b[], int m, int n) {
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]) {i++; continue;}
            if(j>0 && b[j]==b[j-1]) {j++; continue;}
            if(a[i]< b[j]) { System.out.println(a[i]); i++; }
            else if(a[i]>b[j]) { System.out.println(b[j]); j++; }
            else { System.out.println(a[i]); i++; j++; }
        }

        while(i<m){
            if(i>0 && a[i]!=a[i-1]) {System.out.println(a[i]); i++; }
        }

        while(j<n){
            if(j>0 && b[j]!=b[j-1]) {System.out.println(b[j]); j++; }
        }

    }
    public static void main(String[] args) {
        
        int a[] = {3,5,8};
        int b[] = {2,8,9,10,15};
        
        System.out.print("Union");
        union(a, b, a.length, b.length);

        System.out.print("Efficient Union");
        EfficientUnion(a, b, a.length, b.length);

    }
    
}
