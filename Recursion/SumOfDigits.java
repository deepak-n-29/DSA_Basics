package Recursion;

public class SumOfDigits {
    
    // Function to calculate the sum of digits of a number using recursion
    public static int sumOfDigits(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: add the last digit to the sum of the remaining digits
        int r=n%10;
        return r%10 + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        int result = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
    }
}
