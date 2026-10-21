package Arrays.BasicArrays_Strings.strings;

public class stringConcat {
    public static void main (String[] args){ //Compares 2 Strings lexicographically
        String s1="geeks";
        String s2=s1;

        s1=s1+"forgeeks";
        s2=s2.concat("forgeeks");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);


    }
}
