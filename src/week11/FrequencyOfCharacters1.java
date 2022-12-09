package week11;

/*
Map -- Frequency of Characters
Write a method that prints the frequency of each character from a String
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters1 {

    public static void FrequencyOfChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();//insertion order

        for(Character each : str.toCharArray()){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);// get the value of each and +1
            }else{
                map.put(each,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "Good Morning";
        FrequencyOfChar(str);//
    }
}
