package week3;

public class PrimeNumber {
   /* public static void main(String[] args) {

        int n = 10;
        boolean isPrime = false;

        for ( int i = 2; i < n/2; i ++ ){
            if( n %i == 0){ // is not prime number's condition
                isPrime = true;
                break;
            }

        }
        if(!isPrime)
            System.out.println(n +" is a prime number");
        else{
            System.out.println(n + " is not a prime number");

        }

    }*/
            public static boolean isPrime (int n){

        for(int i = 2; i<=n/2; i++){


            if( n % i ==0){
                return false;

            }

        }
             if(n < 2){
               return false;
        }
               return true;
            }


    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }


}
