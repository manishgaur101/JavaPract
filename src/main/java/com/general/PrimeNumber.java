package com.general;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Prime Number - a natural number greater than 1 that has no positive divisors other than 1 and itself.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check if it's a prime number: ");
        int data = 0;
        if(input.hasNextInt()){
            data = input.nextInt();
            boolean prime  = isPrimeJava8(data);
            //System.out.println(isPrime(data) ? data+" is a prime number." : data +" is not a prime number.");
            System.out.println(prime ? data+" is a prime number." : data +" is not a prime number.");
            if (prime) {
                System.out.printf("Prime numbers till %d are:\n", data);
                printAllPrime(data);
            }
        }
        else{
            System.out.println("Please enter a number only.");
            return;
        }
    }

    /**
     * Function to check Prime number using Java7
     * @param n
     * @return
     */
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Function to check Prime number using java8.
     * @param n
     * @return
     */
    public static boolean isPrimeJava8(int n){
        //Predicate<Integer> primePredicate = a -> num % a ==0;
        return n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(a -> n % a ==0);
    }

    /**
     * Function to print all the prime numbers till given number.
     * @param n
     */

    public static void printAllPrime(int n){
        IntStream.rangeClosed(2,n)
                .filter(PrimeNumber::isPrime)
                .forEach(System.out::println);

    }
}
