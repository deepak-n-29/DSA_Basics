package Sorting.problemList;

// Count Inversion in an array
// An inversion is a pair of elements in an array such that the elements are out of order.
// For example, in the array [2, 4, 1, 3, 5], the pairs (2, 1), (4, 1), and (4, 3) are inversions, Total inversions are 3


public class CountInversion {
    
    public static int CountInversion(int arr[], int n){
        int res=0;
        for(int i=0;i<(n-1);i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    res++;
                }
            }
        }
        return res;
    }

    public static int sort(int arr[], int l, int r){
        int count=0;
        if(l<r){
            int m = l + (r-l)/2;
            count+=sort(arr,l,m); 
            count+=sort(arr,m+1,r);
            count+=mergeCountInversion(arr,l,m,r);
        }
        return count;
    }
    public static int mergeCountInversion(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];    
        }
        int res=0,i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
                res += (n1 - i); // Count inversions
            }   
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        int count = CountInversion(arr,n);
        System.out.println("CountInversion : "+ count);

        int arr2[] = {2, 4, 1, 3, 5};
        int n2 = arr2.length;
        int result = sort(arr2, 0, n2 - 1);
        System.out.println("CountInversion using Merge Sort: " + result);


    }

}
