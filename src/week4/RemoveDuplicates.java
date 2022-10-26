package week4;

/*
Write a return method that can remove the duplicated values from
String. Ex: removeDup("AAABBBCCC") ==> ABC
 */

import java.util.*;

public class RemoveDuplicates {

    // by Anaris

    public static String removeDublicates(String word){

        // Set does not allow duplication and LinkedHashSet maintains the sequences
        Set<String> list = new LinkedHashSet<>(Arrays.asList(word.split("")));

        String result = "";
        for (String each : list){
            result += each;
        }
        return result;

    }
    public static void main(String[] args) {

        String word = "AAABBBCCCC";

        System.out.println(removeDublicates(word));
    }
}
