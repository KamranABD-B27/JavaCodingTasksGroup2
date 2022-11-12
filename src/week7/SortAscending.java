package week7;

/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

import java.util.Arrays;

public class SortAscending {

    public static int[] sortingArrayAscending(int[] array) {
    int[] resultAscending = Arrays.copyOfRange(array, 0, array.length);
// {10, 9, 8, 8, 7, -7, -1};
    for (int x = 0; x < resultAscending.length; x++) {

        for (int y = 0; y < resultAscending.length; y++) {
            if (resultAscending[x] < resultAscending[y]) {
                int temp = resultAscending[x];
                resultAscending[x] = resultAscending[y];
                resultAscending[y] = temp;
            }}}
    return resultAscending;
}
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 8, 7, -7, -1};
        System.out.println(Arrays.toString(sortingArrayAscending(arr)));
    }}