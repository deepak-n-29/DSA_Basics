package Recursion;

public class towerOfHanoi {
    
    static void toh(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        toh(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        toh(n - 1, helper, source, destination);
    }
    public static void main(String[] args){
        int n=3;
        toh(n, 'A', 'B', 'C');
    }
}
