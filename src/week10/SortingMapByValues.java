package week10;
/*
Map -- Sort the map by values
Write a method that can sort the Map by values
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingMapByValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,55,4,44));
        SortingArrayListAsc(list);
    }
    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

}
