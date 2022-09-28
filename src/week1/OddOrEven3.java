package week1;

public class OddOrEven3 {
    public static void main(String[] args) {

        int i = 6;
        for (i = 0; i <= 6; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is even");
            } if (i % 2 != 0) {
                System.out.println(i + " is odd");
            }
        }
    }
}
