package week8;
/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */

import java.util.Arrays;

public class MovesZerosToEnd {
    public static void orderedArray (int[] A){

        int temp = 0;

        for (int i : A) {
            if(i != 0){
                A[temp++] = i;
            }

        }

        for (int i = temp; i < A.length; i++) {
            A[i] =0;
        }
    }

    public static void main(String[] args) {


        int[] A = {1,0,2,0,3,0,4,0};

        orderedArray(A);

        System.out.println(Arrays.toString(A));

    }

    public static int[] moveZerosToTheEnd(int[] nums){

        int[] result = new int[nums.length];  //
        int count = 0;

        for (int each: nums){
            if (each != 0){
                result[count++] = each;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,0,2,0,3,0,4,0};

        int[] result = new int[nums.length];  //
        int count = 0;

        for (int each: nums){
            if (each != 0){
                result[count++] = each;
            }
        }
        System.out.println(Arrays.toString(result));
    }



}



