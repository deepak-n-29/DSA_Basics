package Arrays.BasicArrays_Strings.strings;
import java.util.Scanner;

public class reverseString {

    static String reverseStr(String input){
        String temp="";
        int ptr = input.length()-1;
        while(ptr>=0){
            temp=temp+input.charAt(ptr);
            ptr--;
        }
        return temp;
    }

    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("provide the input: ");
            String input = s.nextLine();
            System.out.println(reverseStr(input));
        }
    }
}
