package week11;

/*
Map -- Unique character from String
Find Unique Characters of a string and put them in a map with the number of occurrences as 1
For example:
“aabccddeffft”
{b=1,e=1,t=1}
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void UniqueChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char each: str.toCharArray()){
            if(map.containsKey(each)){
                map.remove(each);

                }else{
                map.put(each,1);


            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "aaabddbschhhy";
        UniqueChar(str);
    }
}
