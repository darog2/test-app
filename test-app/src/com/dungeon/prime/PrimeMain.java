package com.dungeon.prime;

public class PrimeMain {
    public static void main(String[] args) {
        int number1 =17;
        int number2=53;
        for (int i = number1; i <= number2 ; i++) {
            if (isNumberPrime(i)) {
                System.out.println(i + " is prime") ;
            } else {
               // System.out.println(i + " is not prime");
            }

        }

//        double sqrt = Math.sqrt(number);
//        for (long i = 2; i < sqrt; i++) {
//            if (number % i == 0) {
//                System.out.println("number is not prime");
//                return;
//            }
//        }
//        System.out.println("number is prime");
    }
    public static boolean isNumberPrime(long number){
        double sqrt = Math.sqrt(number);
        for (long i = 2; i <= sqrt; i++) {
            if (number % i == 0) {

                return false;
            }
        }
        return true;
    }


}
