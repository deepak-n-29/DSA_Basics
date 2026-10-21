package Sorting.problemList;

public class MergeFunction {
    
    public void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }

    public static void main(String[] args) {
        MergeFunction mf = new MergeFunction();
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        int mid = (n - 1) / 2;
        mf.merge(arr, 0, mid, n - 1);
        System.out.println("Array after merging:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
