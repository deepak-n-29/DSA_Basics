package Recursion;

public class factorial_tailRecursion {
    
    // Head recursion // time complexity is O(n) and space complexity is O(n)
    static int headFact(int n){ 
        if(n<=1) return 1;
        return n * headFact(n-1);
    }

    // Tail recursion // k is the accumulator 
    // time complexity is O(n) and space complexity is O(1)
    static int tailFact(int n, int k) { 
       if(n<=1) return k; // Base case: if n is 0 or 1, return the accumulated result
       return tailFact(n-1, k*n);
    }
    public static void main(String[] args) {
        int n = 5; // Example value for n
        System.out.println("Factorial of " + n + " is: " + tailFact(n, 1));
        System.out.println("Factorial of " + n + " is: " + headFact(6));
    }
}
