package Arrays.BasicArrays_Strings.strings;

public class stringmethod2 {
    public static void main (String[] args){
        String str1="geeks";
        String str2="geeks";
        if(str1==str2) {
            System.out.println("str1-str2 <-> Yes");
        } else
            System.out.println("str1-str2 <-> No");
        String str3=new String("geeks");
        if(str1==str3)
            System.out.println("str1-str3 <-> Yes");
        else
            System.out.println("str1-str3 <-> No");

    }
}
