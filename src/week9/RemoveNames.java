package week9;
/*
ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveNames {

    // SOLUTION 1:
    public static ArrayList<String> removeName1(ArrayList<String> nameList) {

        Iterator<String> iterator = nameList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Ahmed")) {
                iterator.remove();
            }
        }

        return nameList;

    }

    // SOLUTION 2:
    public static ArrayList<String> removeName2(ArrayList<String> nameList) {

        nameList.removeIf(eachName -> eachName.equals("Ahmed"));

        return nameList;

    }


    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mayira", "Anar", "Marjan", "Ahmed", "Salih", "Farag"));

        System.out.println(removeName1(nameList));
        System.out.println(removeName2(nameList));
    }

}
