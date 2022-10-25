package week5;
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA

public class Reverse {


    public static void Reverse(String word){
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

    }

    public static void main(String[] args) {
        Reverse("ABCD");
    }

}
