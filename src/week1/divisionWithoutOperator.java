package src.week1;

public class divisionWithoutOperator {
     /*
    Numbers -- Divide without / operator
       Write a method that can divide two numbers without using division operator

     */

    // This is real solution

    public static int divideWithoutOperator(int a, int b) {
        int result = 0;

        if ((a >= 0 && b > 0) || (a <= 0 && b < 0)) {
            while (Math.abs(a) >= Math.abs(b)) {   // if a < b , loop will not run and return 0.
                a -= b;
                result++;
            }

        } else if ((a >= 0 && b < 0) || (a <= 0 && b > 0)) {
            while (Math.abs(a) >= Math.abs(b)) {
                a = Math.abs(a);
                b = Math.abs(b);
                a -= b;
                result++;
            }
            result = -result;
        } else if (b == 0) {
            throw new NoZeroException();
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(divideWithoutOperator(3, 0));

    }
}

class NoZeroException extends RuntimeException {
    public NoZeroException() {
        super("b can't be zero");
    }
}



