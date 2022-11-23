package week9;
/*
Array - Concat two arrays
Write a return method that can concate two arrays
 */

import java.util.Arrays;

public class ConcatTwoArrays {

    // by Anaris
    public static void mergedArrays(int[] array1, int[]array2){

        int[] merged = new int[array1.length + array2.length];

        int count = 0;

        for(int each: array1){
            merged[count++] = each;
        }

        for(int each: array2){
            merged[count++] = each;
        }

        System.out.println(Arrays.toString(merged));
    }

    public static void mergedArrays(String[] array3, String[]array4){

        String[] merged = new String[array3.length + array4.length];

        int count = 0;

        for(int i=0; i<= array3.length-1;i++){
            merged[count++] = array3[i];
        }

        for(int i=0; i<= array4.length-1;i++){
            merged[count++] = array4[i];
        }

        System.out.println(Arrays.toString(merged));
    }

    public static void mergedArrays2(String[] array5, String[]array6){

        String[] merged = new String[array5.length + array6.length];


        for(int i=0; i<= array5.length-1;i++){
            merged[i] = array5[i];
        }

        for(int i=0; i<= array6.length-1;i++){
            merged[i+array5.length] = array6[i];
        }

        System.out.println(Arrays.toString(merged));
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};

        String[] array3 = {"anaris","java","test"};
        String[] array4 = {"baku","name","john"};

        mergedArrays(array1,array2);
        mergedArrays(array3,array4);
        mergedArrays2(array3,array4);


    }

}
