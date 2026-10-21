package Arrays.BasicArrays_Strings.strings;

/*method same as string
* 1.length() 2.charAt(index) 3.indexOf(str) 4.indexOf(str,fromIndex)
* 5.lastIndexOf(str) 6.lastIndexOf(str,fromIndex) 7.compareTo(str)
* 8.substring(beginIndex) 9.substring(beginIndex,endIndex)
*/
/* New Methods
* 1.append(x) x- object,float,boolean, int, char, string
* 2.insert(offset,x) 3.SetCharAt(index,c) 4.reverse() 5.deleteCharAt(index)
* 6.delete(start,end) 7.Capacity() 8.replace(start,end,str)
*/

public class stringBuilderAndBufferMethods {
    public static void main (String[] args){ //Compares 2 Strings lexicographically

        StringBuilder sb1 = new StringBuilder("geeks");

        System.out.println(sb1.reverse());
        System.out.println(sb1.append("forGeeks"));
        sb1.setCharAt(8,'g');
        System.out.println(sb1);
        System.out.println(sb1.delete(0,5));
        System.out.println(sb1.insert(0,"geeks"));

        System.out.println();

        StringBuffer sb2 = new StringBuffer("geeks");

        System.out.println(sb2.reverse());
        System.out.println(sb2.append("forGeeks"));
        sb2.setCharAt(8,'g');
        System.out.println(sb2);
        System.out.println(sb2.delete(0,5));
        System.out.println(sb2.insert(0,"geeks"));
    }
}
