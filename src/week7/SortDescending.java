package week7;

/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */

import java.util.Arrays;

public class SortDescending {

    public static int[] sortingArrayDescending(int[] arr) {
        int[] resultDescending = Arrays.copyOfRange(arr, 0, arr.length);
        for (int i = 0; i < resultDescending.length; i++) {
            for (int j = 0; j < resultDescending.length; j++) {
                if (resultDescending[i] > resultDescending[j]) {
                    Integer temp = resultDescending[i];
                    resultDescending[i] = resultDescending[j];
                    resultDescending[j] = temp;
                }
            }
        }
        return resultDescending;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, -8, -1, 3, -2, 13};
        System.out.println(Arrays.toString(sortingArrayDescending(arr)));
    }
}
