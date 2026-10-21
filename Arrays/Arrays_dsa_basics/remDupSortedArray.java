
public class remDupSortedArray {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Efficient solution
    public static int removeDuplicates(int arr[],int n){
        if(n == 0 || n == 1) {  return n;}
        
        int j=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;

    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 40};
        int n = arr.length;
        System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = removeDuplicates(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    }
}