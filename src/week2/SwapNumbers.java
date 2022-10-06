package week2;

public class SwapNumbers {
    public static void main(String[] args) {


    // 5 different approaches

    // Case: 1


    int x = 8;
    int y = 6;

    x = x + y;// 14
    y = x - y;//8
    x = x - y;//6

        System.out.println("x is " + x + "\ny is " + y);

/*
        // Case: 2
        //Let x and y be non-zero numbers

        int x = 8;
        int y = 6;

        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("x is " + x + "\ny is " + y);


        // Case: 3

        int x = 8;
        int y = 6;

        y = x + y - (x = y);

        System.out.println("x is " + x + "\ny is " + y);


        // Case: 4

        int x = 8;
        int y = 6;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("x is " + x + "\ny is " + y);


        // extra: Case 5 ( with a third variable ) :

        int x = 8;
        int y = 6;

        int z = x;
        x = y;
        y = z;

        System.out.println("x is " + x + "\ny is " + y);


        */

}}
