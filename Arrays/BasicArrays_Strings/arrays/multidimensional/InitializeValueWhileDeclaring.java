package Arrays.BasicArrays_Strings.arrays.multidimensional;
public class InitializeValueWhileDeclaring {

        public static void main(String[] args) {

            // Array Initialized and Assigned
            int[][] arr = {{1, 2}, {3, 4}};

            // Printing the Array
            for (int[] i : arr) {
                for (int k : i)
                    System.out.print(k + " ");
                System.out.println();
            }

//            for(int i = 0; i < arr.length; i++) {
//                for(int j = 0; j < arr[i].length; j++)
//                    System.out.print(arr[i][j] + " ");
//                System.out.println();
//            }


        }
}
