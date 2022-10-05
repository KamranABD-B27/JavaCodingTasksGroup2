package week2;

public class DivisibleBy_3_5_15 {

    public static void main(String[] args) {

        ///divisible by3,5,15

        String divisibleby15 = "";
        String divisibleby5 = "";
        String divisibleby3 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleby15 += i + " ";

            } else if (i % 5 == 0) {
                divisibleby5 += i + " ";

            } else if (i % 3 == 0) {
                divisibleby3 += i+" ";

            }


        }

        System.out.println("divisibleby3 = " + divisibleby15);
        System.out.println("divisibleby5 = " + divisibleby5);
        System.out.println("divisibleby15 = " + divisibleby3);


    }
}



