package week6;
/*
Write a method that can return the sum of the digits in a string
 */

public class SumOfDigits {
    
    public static int sumOfDigits(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.charAt(i)+"");  // "9" -> 9
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "eo1g9;fj23nf?s";
        System.out.println(sumOfDigits(str));
    }
}
