package Arrays.BasicArrays_Strings.arrays;
import java.util.Scanner;

public class TakeInputInAnArray {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+"->");
            }
        }

    }
}
