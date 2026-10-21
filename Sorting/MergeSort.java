package Sorting;

public class MergeSort {
    static void merge(int arr[], int l, int m, int r){
        //Find sizes of 2 subarrays to be merged.
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int i=0;i<n1;i++){
            System.out.print(L[i]+ " ");
        }
        System.out.println("Left array");
        for(int j=0;j<n2;j++){
            R[j]=arr[m+j+1];
        }
        for(int j=0;j<n2;j++){
            System.out.print(R[j]+ " ");
        }
        System.out.println("Right array");
        /*merge the temp arrays */
        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        /*copy remaining elements of L[] if any */
        while(i<n1){
            arr[k]=L[i];
            k++;
            i++;
        }
        /*copy remaining elements of R[] if any */
        while(j<n2){
            arr[k]=R[j];
            k++;
            j++;
        }
    }

    static void sort(int arr[], int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            System.out.println("Dividing left side: " + l + " " + m);
            sort(arr,l,m); 
            System.out.println("Dividing Right side: "+ (m+1) + " " + r);
            sort(arr,m+1,r);
            System.out.println("Merging starts: "+ l + " " + m + " " + r);
            merge(arr,l,m,r);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n  = arr.length;

        int l=0, r=n-1;
        sort(arr, l, r);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
