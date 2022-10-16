package week3;

public class ArmstrongNumber {
     /*
      Write a method that can check if a number is Armstrong number

      abcd = a^n + b^n + c^n + d^n;
     */

    public static void isArmstrongNumber(int n){
        // 153 = 1*1*1 + 5*5*5 + 3*3*3
        String num = String.valueOf(n);   // int --> String
        int sum = 0;

        for (int i = 0; i < num.length(); i++){    // iterate number one by one
            int multiply = 1;

            for (int j = 0; j < num.length(); j++){
                multiply *= Integer.parseInt(num.substring(i, i+1));  // every digit multiply num.length() times
            }
            sum += multiply;
        }

        if (sum == n){
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }


    }

    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(371);
        isArmstrongNumber(1634);
        isArmstrongNumber(200);
    }
}
