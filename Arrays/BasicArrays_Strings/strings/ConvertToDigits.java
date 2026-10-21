package Arrays.BasicArrays_Strings.strings;

public class ConvertToDigits {

    public String ConvertToDigits(String s){

        String[] parts = s.split(" ");
        String numString = parts.length > 1 ? parts[1] : parts[0];

        numString = numString.replaceAll(",", "");

        double number = Double.parseDouble(numString);
        if(number % 1 == 0){
            int num = (int) number;
            return Integer.toString(num); 
        }
        
        String roundValue = String.format("%.2f", number);
        return roundValue;

    }
    public static void main(String[] args) {
        String s = "$ 12,345.00";
        String s1 = "$ 12,345.55";

        ConvertToDigits ctd = new ConvertToDigits();
        String result = ctd.ConvertToDigits(s);
        System.out.println("The converted digits are: " + result); //

        String result1 = ctd.ConvertToDigits(s1);
        System.out.println("The converted digits are: " + result1); 

    }
    
}
