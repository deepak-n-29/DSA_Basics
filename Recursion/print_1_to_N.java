package Recursion;

public class print_1_to_N {
    static void printNumbers(int n) {
        if(n<1)
            return; // Base case: if n is less than 1, return
        printNumbers(n - 1); // Recursive call before printing
        System.out.print(n + " "); // Print the current number after the recursive call
    }

    static void printNumbersTail(int n,int k){
        if(n<1)
            return; // Base case: if n is less than 1, return
        System.out.print(k + " "); // Print the current number before the recursive call
        printNumbersTail(n - 1, k + 1); // Recursive call with incremented k
    }
    public static void main(String[] args) {
        int n = 5; // Example value for n
        System.out.println("Printing numbers from 1 to " + n + ":");
        printNumbers(n);
        System.out.println("\nPrinting numbers from 1 to " + n + " using tail recursion:");
        printNumbersTail(n, 1); // Start with k = 1 for tail recursion
        System.out.println();
    }
}
