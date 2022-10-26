package week4;

/* Write a return method that can find the frequency of characters. Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

public class FrequencyOfCharacters {
    public static String Frequency (String str){
        String frequency="";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            if ( !frequency.contains(str.charAt(i)+"")){
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)){
                        count++;}}
                frequency += "" + str.charAt(i)+count;
            }} return frequency;}
    public static void main(String[] args) {
        System.out.println( Frequency("SSffTFT"));

    }
}
