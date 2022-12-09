package week11;

/*
Map -- Unique character from String
Find Unique Characters of a string and put them in a map with the number of occurrences as 1
For example:
“aabccddeffft”
{b=1,e=1,t=1}
 */

import javax.xml.stream.events.Characters;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static Map<Character, Integer> UniqueCharactersMap(String str) {

        Map<Character, Integer> countingMap = new LinkedHashMap<>();

        for (char eachCha : str.toCharArray()) {
            if (countingMap.containsKey(eachCha)) {
                countingMap.put(eachCha, countingMap.get(eachCha) + 1);
            } else {
                countingMap.put(eachCha, 1);
            }
        }

        Map<Character, Integer> uniqueCharacters = new LinkedHashMap<>();
        countingMap.forEach((uniqueCha, counting) -> {
            if (counting == 1) {
                uniqueCharacters.put(uniqueCha, counting);
            }
        });

        return uniqueCharacters;
    }

    //“aabccddeffft”
    //    {b=1,e=1,t=1}
    public static void main(String[] args) {
        System.out.println(UniqueCharactersMap("aabccddeffft"));

    }
}