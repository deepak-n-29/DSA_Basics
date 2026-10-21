package Arrays.BasicArrays_Strings.strings;

public class stringIndexOf {
    public static void main (String[] args){ //Compares 2 Strings lexicographically
        String str1="geeksforgeeks";
        String s2="geeks";
        String s3="for";

        System.out.println(str1.indexOf("k"));
        System.out.println(str1.indexOf(s2));
        System.out.println(str1.indexOf(s3));
        System.out.println(str1.indexOf(s2,1));

    }
}
