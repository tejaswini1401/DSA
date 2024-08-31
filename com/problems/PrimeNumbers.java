package com.problems;

public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false; 
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 1000:");

        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

