package Recursion;

public class ropeCutting {

    // Function to find the maximum number of pieces a rope can be cut into
    // given lengths a, b, and c.
    public static int maxPieces(int n, int a, int b, int c) {
        // Base case: if the length of the rope is 0, return 0
        if(n==0) return 0;
        if(n<0) return -1;

        int res = Math.max(maxPieces(n-a, a, b, c), 
                           Math.max(maxPieces(n-b, a, b, c), maxPieces(n-c, a, b, c)));
        // If res is -1, it means no valid cuts were found
        if(res == -1) return -1;    
        // If a valid cut was found, add 1 to the result
        return res + 1;
    }
    public static void main(String[] args) {
        int n = 5; // Length of the rope
        int a = 2; // First cut length
        int b = 3; // Second cut length
        int c = 5; // Third cut length
        
        System.out.println("Maximum number of pieces: " + maxPieces(n, a, b, c));
    }   
}
