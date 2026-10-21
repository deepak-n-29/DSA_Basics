package Recursion;




public class fibonacci {

    // Head recursion // time complexity is O(n) and space complexity is O(n)
    static int headFib(int n) {
        if (n <= 1) return n; // Base case: if n is 0 or 1, return n
        return headFib(n - 1) + headFib(n - 2);
    }   

    // Tail recursion // a is the first Fibonacci number, b is the second Fibonacci number
    // time complexity is O(n) and space complexity is O(1)
    static int tailFib(int n, int a, int b) {
        if (n == 0) return a; // Base case: if n is 0, return the first Fibonacci number
        if (n == 1) return b; // Base case: if n is 1, return the second Fibonacci number
        return tailFib(n - 1, b, a + b); // Recursive call with updated values
    }
    public static void main(String[] args) {
        int n = 5; // Example value for n
        System.out.println("Fibonacci of " + n + " is: " + headFib(n));
        System.out.println("Fibonacci of " + n + " is: " + tailFib(n, 0, 1));
    }
}
