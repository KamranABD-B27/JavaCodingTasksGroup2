package week9;
/*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,222,333,454,6,7,8,101));
        for (int i = 0; i < list1.size(); i++) {
//            list1.removeIf(n -> n > 100);  //ready made method
            if (list1.get(i) > 100){
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
    }
}

