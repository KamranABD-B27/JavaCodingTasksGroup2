package week8;
/*
Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -
1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
 */

public class N_UniqueIntegers {

    public static void sumUpNumbersToZero (int N){

        for (int i = 1; i <= N/2; i++) {
            System.out.print(i + "," + -i + ",");
        }

        if(N % 2 ==1){
            System.out.print(0);
        }
    }


    public static void main(String[] args) {
        int A = 5;
        sumUpNumbersToZero(A);
    }


}
