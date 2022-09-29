package week1;

public class oddOrEven {



    static String oddOrEven( int number ){
        if ( number%2 == 0){ return number+" is Even";
        } else { return number+" is Odd";}

    }



    public static void main(String[] args) {

        System.out.println(oddOrEven(2));
        System.out.println(oddOrEven(3));
    }
}
