package week5;

//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA

public class Reverse {
    public static String revStr(String str) {

        String reverse="";

        for (int i = 0; i < str.length(); i++) {
            reverse=str.charAt(i)+reverse;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(revStr("java"));
    }
}


