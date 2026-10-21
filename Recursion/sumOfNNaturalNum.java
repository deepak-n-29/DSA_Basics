package Recursion;

public class sumOfNNaturalNum {

    static int sum(int n){
        if(n<=0) return 0;
        return n + sum(n-1); // Recursive call to sum the numbers
    }

    static int sumTail(int n, int k){
        if(n<=0) return k;
        return sumTail(n - 1, k + n); // Tail recursive call with accumulated sum
    }
    public static void main(String[] args) {
        int n = 5; // Example value for n
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
        System.out.println("Sum of first " + n + " natural numbers using tail recursion is: " + sumTail(n, 0));
    }
}
