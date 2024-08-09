package com.general;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Please Enter a whole number:");
        Scanner input = new Scanner(System.in);
        int num = 0 ;
        if(input.hasNextInt()){
            num = input.nextInt();
            isEvenOdd(num);
        }
        else {
            System.out.println("Please enter a whole number only, next time.");
            return;
        }

        printEvenNumbers(6,num);

        //Using Java8 to find number is Even Number or off number.
        Predicate<Integer> isEven = i -> i % 2==0;
        System.out.println(isEven.test(num)== true ? num+" is an even number.":num+" is an odd number.");


    }

    public static void printEvenNumbers(int startNumber, int tillNumber){

        int count = startNumber == 0 ? 2 : startNumber;
        System.out.println("All the Even Numbers from "+startNumber+ " till "+ tillNumber+": ");
        while(tillNumber >= count){
            System.out.print(count%2==0?count:" ");
            count++;
        }
        System.out.println();
    }
    public static void isEvenOdd(int num){
        System.out.println(num%2==0 ? num+" is an even number." : num+" is an odd number.");
    }

}
