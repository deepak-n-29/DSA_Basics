package Arrays.BasicArrays_Strings.arrays;
public class CheckIfArrayIsSorted {
    
    public static boolean CheckIfArrayIsSorted(int [] a){

        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        int[][] testCases = {
                {},              // Empty array
                {5},             // Single element
                {10, 20, 30},    // Sorted array
                {30, 20, 10},    // Descending order
                {10, 30, 20},    // Unsorted array
                {1, 2, 2, 3, 4}, // Array with duplicate elements
                {5, 5, 5, 5}     // Array with all identical elements
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.print("Test case " + (i + 1) + ": ");
            if (CheckIfArrayIsSorted(testCases[i])) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }


    @Override
    public String toString() {
        return "CheckIfArrayIsSorted []";
    }
}

