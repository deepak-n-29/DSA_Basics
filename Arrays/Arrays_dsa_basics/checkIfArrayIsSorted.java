public class checkIfArrayIsSorted{

    // Naive Approach O(n^2)
    public static boolean isSorted(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    // Efficient Approach O(n)
    public static boolean isSortedEfficient(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 3, 2, 1, 4};
        System.out.println("Is arr1 sorted? " + isSorted(arr1));
        System.out.println("Is arr2 sorted? " + isSorted(arr2));
    }
}