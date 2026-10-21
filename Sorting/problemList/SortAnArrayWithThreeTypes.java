package Sorting.problemList;


//  Sort an array consisting of only three types of elements
// 1. Segregate 0s, 1s and 2s in an array

// 2. Three way partitioning using pivot
    // Input : {2,1,2,20,10,20,1} , pivot = 2
    // Output : {1,1,2,2,20,10,20}

    // The idea is to maintain three pointers: low, mid, and high.
    // - low points to the next position to place a 0.
    // - mid is used to traverse the array.
    // - high points to the next position to place a 2.
    // We iterate through the array using the mid pointer and swap elements to ensure that all 0s are at the beginning,
    // followed by 1s, and all 2s at the end.
    // This approach ensures that we traverse the array only once, achieving O(n) time complexity and O(1) space complexity.
    // This technique is efficient and works well for arrays with only three distinct types of elements.

   
// 3. Partition around a given range
    // input: {10,5,6, 3,20,9,40} , range = [5,10]
    // output: {3,5,6,9,10,20,40}
    
    // The idea is to maintain three pointers: low, mid, and high.
    // - low points to the next position to place an element less than lowVal.
    // - mid is used to traverse the array.
    // - high points to the next position to place an element greater than highVal.
    // We iterate through the array using the mid pointer and swap elements to ensure that all elements less than lowVal are at the beginning,
    // followed by elements within the range [lowVal, highVal], and all elements greater than highVal at the end.
    // This approach ensures that we traverse the array only once, achieving O(n) time complexity and O(1) space complexity.
    // This technique is efficient and works well for arrays with elements that need to be partitioned around a given range.

public class SortAnArrayWithThreeTypes {

    void sort(int arr[], int n){ //Time Complexity: O(n), Space Complexity: O(n)
        int temp[] = new int[n];
        int index=0;
        for(int i=0;i<n;i++){ 
            if(arr[i] == 0){                //three way partitioning: if(arr[i]<pivot), partition around a given range: if(arr[i]<lowVal)
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] == 1){                //three way partitioning: if(arr[i]==pivot), partition around a given range: if(arr[i]>=lowVal && arr[i]<=highVal) 
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] == 2){                //three way partitioning: if(arr[i]>pivot), partition around a given range: if(arr[i]>highVal)
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }


    void EfficientSort(int arr[], int n){ // using dutch national flag algorithm  and Time Complexity: O(n), Space Complexity: O(1)
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            if(arr[mid]==0){    // three way partitioning: if(arr[mid]<pivot), partition around a given range: if(arr[mid]<lowVal)
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){ // three way partitioning: if(arr[mid]==pivot), partition around a given range: if(arr[mid]>=lowVal && arr[mid]<=highVal)
                mid++;
            }
            else{
                swap(arr,mid,high); // three way partitioning: if(arr[mid]>pivot), partition around a given range: if(arr[mid]>highVal)
                high--;
            }
        }
    }
    

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        SortAnArrayWithThreeTypes sorter = new SortAnArrayWithThreeTypes();
        int arr[] = {0, 1, 2, 0, 1, 2, 1, 0};
        int n = arr.length;
        sorter.sort(arr, n);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
