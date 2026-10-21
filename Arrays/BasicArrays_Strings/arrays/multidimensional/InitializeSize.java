package Arrays.BasicArrays_Strings.arrays.multidimensional;
import java.util.Scanner;

public class InitializeSize {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            // Row and Columns in Array
            int n = 2;
            int m = 3;

            // Array declared and initialized
            int[][] arr = new int[n][m];

            // Assigning the values to array
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int val = s.nextInt();
                    arr[i][j] = val;
                }
            }

            // Printing the Array
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }
    }
}
