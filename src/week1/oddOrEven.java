package src.week1;

public class oddOrEven {
    /*
    Numbers -- odd & even
       Write a method which can identifies given number is even or odd
     */
    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


    public static void main(String[] args) {
        oddOrEven(5);
    }
}
