package week5;

public class FindUniqueCharacters {
    public static void uniqueCharacters(String word) {

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j <word.length() ; j++) {
                if(word.charAt(i)==word.charAt(j)){count++;}
            }
            if (count == 1)
                System.out.println(word.charAt(i));

        }

    }

    public static void main (String[]args){
        uniqueCharacters("AAABBBCCCDEF");
    }
}
