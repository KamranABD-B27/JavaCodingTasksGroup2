package week11;

/*
Map -- Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)
 */

import java.util.HashMap;
import java.util.Map;

public class MinValue {

    public static Integer minValue(Map<String,Integer> map){

        Integer minValue = Integer.MAX_VALUE;

        for (String eachKey: map.keySet()){

            if (map.get(eachKey) < minValue){
                minValue = map.get(eachKey);
            }
        }

        return minValue;

    }

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("apple", 4);
        map.put("banana",1);
        map.put("pear", 5);
        map.put("kiwi", 9);

        System.out.println(minValue(map));

    }
}
