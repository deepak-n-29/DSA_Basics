package Recursion;

public class palindrome {

    // Function to check if a string is a palindrome using recursion
    static boolean isPalindrome(String s, int start, int end) {
        if(start >= end) {
            return true; // Base case: if start index is greater than or equal to end index, it's a palindrome
        }
        return  (s.charAt(start) == s.charAt(end) && isPalindrome(s, start + 1, end - 1)); // Check characters at start and end, and recurse inward
    }
    public static void main(String[] args) {
        String s = "GeekskeeG";
    	System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
