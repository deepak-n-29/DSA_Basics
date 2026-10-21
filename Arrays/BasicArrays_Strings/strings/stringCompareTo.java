package Arrays.BasicArrays_Strings.strings;

public class stringCompareTo {
    public static void main (String[] args){ //Compares 2 Strings lexicographically
        String str1="geeksforgeeks";
        String str2="for";

        int res=str1.compareTo(str2);

        if(res==0)
            System.out.println("Same");
        if(res>0)
            System.out.println("str1 Greater");
        if(res<0)
            System.out.println("str1 Smaller");
    }
}
