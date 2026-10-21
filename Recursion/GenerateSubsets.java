package Recursion;

public class GenerateSubsets {
    
    // Function to generate all subsets of a set
    static void generateSubsets(String s, String current, int index) { 
        // Base case: if index reaches the length of the string, print the current subset
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character in the subset
        generateSubsets(s, current + s.charAt(index), index + 1);

        // Exclude the current character from the subset
        generateSubsets(s, current, index + 1);
    }
    public static void main(String[] args) {
        String s = "abc"; // Example set
        generateSubsets(s, "", 0);
    }
}
