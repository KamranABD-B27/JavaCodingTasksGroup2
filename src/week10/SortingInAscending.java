package week10;
/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SortingInAscending {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 4, 10, -2));

        arrayList.add(-10);
        arrayList.add(15);
        arrayList.add(5);

        System.out.println("Before sorting = " + arrayList);

        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = arrayList.size() - 1; j > i; j--) {
                if (arrayList.get(i) > arrayList.get(j)) {// this inner loop will compare every single arraylist
                    //element with i value.

                    int temp = arrayList.get(i);//I gave arrayList's i value for the temp variable
                    arrayList.set(i, arrayList.get(j));//I used set() method in order to replace the i with j.
                    arrayList.set(j, temp); // I used set() again to replace the j with temp.

                }

            }

        }
        System.out.println("After sorting = " + arrayList);

    }

}
