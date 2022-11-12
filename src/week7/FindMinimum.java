package week7;

// Write a method that can find the minimum number from an int Array

public class FindMinimum {
    public static void main(String[] args) {
        //Write a method that can find the minimum number from an int Array


        System.out.println(min(-3, -10,1,3,4,2,4,2,45,2));


    }
    public static int min(int ... arr){ // int [] arr IS THE SAME AS int ... arr
        int min = arr[0];

        for(int each : arr){
            if(each < min){//
                min = each;
            }
        }
        return min;
    }

}
