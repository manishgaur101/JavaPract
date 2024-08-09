package com.general;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find it's factorial:");
        int value = isValidNumericInput(input);
        System.out.println(value != -9 ? "Factorial of "+value+" is: "+factorial(value)
                : "Please enter a numeric value only.");
        System.out.println(value != -9 ? "Factorial of "+value+" is: "+factorialUsingJava8(value)
                : "Please enter a numeric value only.");
        System.out.println(0*1);

    }

    /**
     * Finding factorial using recurssion.
     * @param n
     * @return
     * About this approach - Elegant and simple,
     * but be cautious with large values of n as it may lead to a StackOverflowError.
     */
    public static int factorial(int n){
        return (n==0 || n==1) ? 1 : n * factorial(n-1);
    }

    public static int isValidNumericInput(Scanner scan){
        return scan.hasNextInt() ?  scan.nextInt() : -9 ;
    }

    /**
     * Factorial find using java8 Stream.
     * @param n
     * @return
     * Note - used reduce with identity argument, if stream is empty then identity is returned.
     * This is why if input is 0 then it will return identity value whatever we are taking.
     * Identity Value: The identity value is the value that is returned when the stream has no elements.
     * It also serves as a neutral element in the reduction operation.
     * This value also take as the first value coz at start we get only one input. so it multiplies
     * identity with the first input as first step.
     * To pass a empty stream - IntStream.of().reduce()
     * To pass a single value stream - IntStream.of(0).reduce()
     */
    public static int factorialUsingJava8(int n){
        return IntStream.rangeClosed(1,n)
                .reduce(1,(a,b)-> a*b);
    }


}
