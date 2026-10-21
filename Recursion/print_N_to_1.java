package Recursion;

public class print_N_to_1 {
    static void printNumbers(int n) {
        // Base case: if n is less than 1, return
        if(n<0)
            return;
            
        System.out.print(n + " ");
        printNumbers(n - 1);        
    }
    public static void main(String[] args) {
        int n = 5; // Example value for n
        System.out.println("Printing numbers from " + n + " to 1:");
        printNumbers(n);

    }
}
