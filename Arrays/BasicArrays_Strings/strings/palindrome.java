package Arrays.BasicArrays_Strings.strings;
import java.util.Scanner;

public class palindrome {


    static boolean naivePalindrome(String input){
        StringBuilder rev = new StringBuilder(input);
        rev.reverse();
        return input.equals(rev.toString());
    }

    static boolean palindrome(String input){
        int stptr = 0;
        int endptr=input.length()-1;
        boolean ispal=true;
        while(stptr<endptr){
            if(input.charAt(stptr)!=input.charAt(endptr)){
                ispal=false;
                break;
            }
            stptr++;
            endptr--;
        }
        return ispal;
    }






    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("provide the input: ");
            String input = s.nextLine();
            System.out.println(palindrome(input));
        }

    }
}
