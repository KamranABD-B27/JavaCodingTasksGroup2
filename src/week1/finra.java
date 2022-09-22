package src.week1;

public class finra {
     /*
    FINRA:
       Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3 print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    // void method
    public static void finra(){

       for(int i = 1; i <= 30; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 3 == 0 ){
                System.out.println("FIN");
            } else if (i % 5 == 0){
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }



    // String return method
    public static String finra1(){
        String result = "";

       for (int i = 1; i <= 30; i++)
            if (i % 3 == 0 && i % 5 == 0){
                result += "FINRA ";
            } else if (i % 3 == 0 ){
                result += "FIN ";
            } else if (i % 5 == 0){
                result += "RA ";
            } else {
                result += i + " ";
            }

        return result.trim();
    }


    public static void main(String[] args) {
        finra();
        System.out.println(finra1());
    }
}
