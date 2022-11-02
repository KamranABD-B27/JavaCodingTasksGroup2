package week6;
/*
Write a method that can find the maximum number from an int Array
 */


public class FindMaximum {

    public static void maxNumArr(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }



        }

        System.out.println(max);

    }


    public static void main(String[] args) {
        maxNumArr(new int[]{2, 3, 4, 5, 6, 89});
    }
}