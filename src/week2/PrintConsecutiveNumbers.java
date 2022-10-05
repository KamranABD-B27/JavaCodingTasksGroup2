package week2;

public class PrintConsecutiveNumbers {


    public static void main(String[] args) {

        String divisibleby2 = "Codility";
        String divisibleby3 = "Test";
        String divisibleby5 = "Coders";
        String result = "";


        int n = 10;
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                result += divisibleby2;
            }
            if (i % 3 == 0) {
                result += divisibleby3;
            }
            if (i % 5 == 0) {
                result += divisibleby5;
            }
            if(! ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) )){
                result=i+"";
            }
            System.out.println(  result);
            result="";

        }

    }



}
