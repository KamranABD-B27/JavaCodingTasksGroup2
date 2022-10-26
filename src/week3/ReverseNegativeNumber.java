package week3;


import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reversNegativeNum());
    }
    public static int reversNegativeNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a negative number: \n");
        int num = input.nextInt() * -1;

        String s  =  Integer.toString(num);
        String sReversed = "";
        for (int i = s.length()-1; i >=0; i--){
            sReversed += s.charAt(i);
        }
        int n = Integer.parseInt(sReversed) * -1;

        return n;
    }
}

