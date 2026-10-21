package Arrays.BasicArrays_Strings.strings;
/* Stringbuilder -> mutable, Single thread
*  StringBuffer -> threadsafe and mutable, for Multithreaded */
public class stringBuilderAndBuffer {
    public static void main (String[] args){ //Compares 2 Strings lexicographically
        String s1="geeks";
        String s2=s1;

        s1=s1+"forgeeks";
        if(s1==s2)
            System.out.println("String output -> Same");
        else
            System.out.println("String -> Not Same");

        StringBuilder sb1 = new StringBuilder("geeks");
        StringBuilder sb2 = sb1;

        sb1=sb1.append("forgeeks");
        if(sb1==sb2)
            System.out.println("StringBuilder output -> Same");
        else
            System.out.println("StringBuilder output -> Not Same");

        StringBuffer sbf1 = new StringBuffer("geeks");
        StringBuffer sbf2 = sbf1;

        sbf1=sbf1.append("forgeeks");
        if(sbf1==sbf2)
            System.out.println("StringBuffer output -> Same");
        else
            System.out.println("StringBuffer output -> Not Same");
    }
}
