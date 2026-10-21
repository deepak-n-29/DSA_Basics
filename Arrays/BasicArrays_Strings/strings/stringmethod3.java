package Arrays.BasicArrays_Strings.strings;

public class stringmethod3 {
    public static void main (String[] args){
        String str1="geeksforgeeks";
        String str2="geeks";
        String str3="geeky";

        System.out.println(str1.contains(str2));
        System.out.println(str1.contains(str3));

        String str4="geeksforgeeks";

        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str2));
    }
}
