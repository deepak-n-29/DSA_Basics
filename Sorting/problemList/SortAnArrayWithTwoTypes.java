package Sorting.problemList;

// Sort an array consisting of only two types of elements
// 1. Segregate 0s and 1s in an array
// 2. Segregate positive and negative numbers in an array
// 3. Segregate even and odd numbers in an array
// The idea is to maintain two pointers, one starting from the beginning and the other from the end of the array.
// We swap elements to ensure that all elements of one type are on one side and the other type on the other side.
// For example, in the case of segregating 0s and 1s, we swap 0s to the front and 1s to the back.
// This approach ensures that we traverse the array only once, achieving O(n) time complexity and O(1) space complexity.
// This method can be adapted for other types of segregation by changing the condition used for swapping.
// For example, for segregating positive and negative numbers, we swap negative numbers to the front and positive numbers to the back.
// Similarly, for even and odd numbers, we swap even numbers to the front and odd numbers to the back.
// This technique is efficient and works well for arrays with only two distinct types of elements.

public class SortAnArrayWithTwoTypes {
    
    public static void naiveSegregateposNeg(int arr[], int n) {
        int temp[] = new int[n];
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){                    // for 0's and 1's: if(arr[i]==0) and for even and odd: if(arr[i]%2==0)
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=0){                    // for 0's and 1's: if(arr[i]==1) and for even and odd: if(arr[i]%2!=0)
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];                  // copy back to original array
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void efficientSegregateposNeg(int arr[], int n){
        int left =-1, right = n;
        while(true){
            do{
                left++;
            }while(left<n && arr[left]<0);           // for 0's and 1's: while(left<n && arr[left]==0) and for even and odd: while(left<n && arr[left]%2==0);

            do{
                right--;
            }while(right>=0 && arr[right]>=0);       // for 0's and 1's: while(right>=0 && arr[right]==1) and for even and odd: while(right>=0 && arr[right]%2!=0);

            if(left>=right){
                return;
            }
            swap(arr,left,right);
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {12, -7, -5, 3, -1, 9, -4, 6};
        int n = arr.length;

        System.out.println("Original array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // Naive approach
        naiveSegregateposNeg(arr, n);
        System.out.println("Array after naive segregation of positive and negative numbers:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // Resetting the array for efficient approach
        int arr2[] = {12, -7, -5, 3, -1, 9, -4, 6};

        // Efficient approach
        efficientSegregateposNeg(arr2, n);
        System.out.println("Array after efficient segregation of positive and negative numbers:");
        for(int num : arr2){
            System.out.print(num + " ");
        }

    }

}
