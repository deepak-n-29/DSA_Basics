package Arrays.BasicArrays_Strings.strings;
public class patternSearch1 {

    static void patSearch(String txt, String pat){
        int pos = txt.indexOf(pat);
        while(pos>=0){
            System.out.println(pos +" ");
            pos = txt.indexOf(pat,pos + 1);
        }
    }

    public static void main(String[] args){
        String txt = "geeks for geeks";
        String pat = "geeks";

        patSearch(txt, pat);
    }

/* The indexOf method in Java is used to search for the entire pattern (substring) in a string.
It returns the starting index of the first occurrence of the pattern if found, or -1 if the pattern does not exist in the string.

Full Match Required: indexOf matches the entire pattern, not just the starting letter or part of the pattern.
Usage: Can find the first occurrence (indexOf(pattern)) or subsequent occurrences by specifying a starting index (indexOf(pattern, fromIndex)). */

}
