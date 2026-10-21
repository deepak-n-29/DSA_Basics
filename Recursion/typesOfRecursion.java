package Recursion;

// Java examples and explanations for types of recursion

public class typesOfRecursion {

    // 1. Tail Recursion
    // Recursive call is the last operation
    static void tailRec(int n) {
        if (n == 0) return;
        System.out.println("Tail: " + n);
        tailRec(n - 1); // recursive call at the end
    }

    // 2. Head Recursion
    // Recursive call happens before any processing
    static void headRec(int n) {
        if (n == 0) return;
        headRec(n - 1); // recursive call first
        System.out.println("Head: " + n);
    }

    // 3. Tree Recursion
    // Function calls itself more than once
    static void treeRec(int n) {
        if (n == 0) return;
        System.out.println("Tree: " + n);
        treeRec(n - 1);
        treeRec(n - 1);
    }

    // 4. Indirect Recursion
    // Function A calls B and B calls A
    static void indirectA(int n) {
        if (n > 0) {
            System.out.println("A: " + n);
            indirectB(n - 1);
        }
    }

    static void indirectB(int n) {
        if (n > 0) {
            System.out.println("B: " + n);
            indirectA(n / 2);
        }
    }

    // 5. Nested Recursion
    // Recursive call inside parameter of another recursive call
    static int nestedRec(int n) {
        if (n > 100)
            return n - 10;
        return nestedRec(nestedRec(n + 11));
    }

    // 6. Linear Recursion
    // Each function calls itself once and performs one task
    static int linearRec(int n) {
        if (n == 0) return 0;
        return n + linearRec(n - 1); // sum from n to 0
    }

    public static void main(String[] args) {
        System.out.println("--- Tail Recursion ---");
        tailRec(3);

        System.out.println("\n--- Head Recursion ---");
        headRec(3);

        System.out.println("\n--- Tree Recursion ---");
        treeRec(2);

        System.out.println("\n--- Indirect Recursion ---");
        indirectA(5);

        System.out.println("\n--- Nested Recursion ---");
        int nestedResult = nestedRec(95);
        System.out.println("Nested Result: " + nestedResult);

        System.out.println("\n--- Linear Recursion ---");
        int sum = linearRec(5);
        System.out.println("Sum using linear recursion: " + sum);
    }
}
