package week10;
/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingInDescending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 55, 4, 44));
        SortingArrayListDesc(list);
    }

    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
