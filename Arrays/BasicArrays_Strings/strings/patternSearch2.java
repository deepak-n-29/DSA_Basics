package Arrays.BasicArrays_Strings.strings;
public class patternSearch2 {
    static String digitAfterDecimal(String num){
        int pos = num.indexOf(".");
        if(pos<0){
            return "-1";
        }
        else{
            return num.substring(pos+1);
        }
    }

    public static void main(String[] args){
        String num = "12.358";

        System.out.println(digitAfterDecimal(num));
    }
}
