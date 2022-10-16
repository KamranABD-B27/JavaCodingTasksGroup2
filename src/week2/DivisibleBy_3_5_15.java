package week2;

import java.util.ArrayList;
import java.util.List;

public class DivisibleBy_3_5_15 {

    // by Anaris

    public static void divisibleNumbers(){

        List<Integer> Divisible15 = new ArrayList<>();
        List<Integer> Divisible5 = new ArrayList<>();
        List<Integer> Divisible3 = new ArrayList<>();

        for(int i = 1; i<100; i++){
            if(i % 15 ==0){
                Divisible15.add(i);
            }
            if(i % 5 == 0){
                Divisible5.add(i);
            }
            if(i % 3 == 0){
                Divisible3.add(i);
            }
        }
        System.out.println("Divisible15 " + Divisible15);
        System.out.println("Divisible5  " + Divisible5);
        System.out.println("Divisible3  " + Divisible3);
    }

    public static void main(String[] args) {
        divisibleNumbers();
    }
}

