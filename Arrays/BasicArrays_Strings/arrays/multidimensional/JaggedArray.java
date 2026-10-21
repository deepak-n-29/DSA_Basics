package Arrays.BasicArrays_Strings.arrays.multidimensional;
/* A jagged array is an array of arrays where each inner array can have a different number of elements,
unlike a regular 2D array where all rows have the same size.*/

public class JaggedArray {
    public static void main(String args[]) {
        int m = 3;
        int arr[][] = new int[m][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
