package com.general;

public class Fibonacci {
    public static void main(String[] args) {

        //Print first n(here 10) fibonacci numbers
        int a = 0;
        int b = 1;
        int place = 10;
        int result = 0;
        System.out.print(a + " " + b + " ");
        while (place > 0) {
            result = a + b;
            System.out.print(result + " ");
            a = b;
            b = result;
            place--;
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
            System.out.println(isFibonacci(i) ? i + " is a Fibonacci Number" :
                    i + " is a not Fibonacci Number");

        int num = 23;
        System.out.println(isFibonacci(num) ? num + " is a Fibonacci Number" :
                num + " is a not Fibonacci Number");
    }

        /**
         * Function which verify if the given number is a fibonacci number or not
         * @param n - Given int value to check
         * return boolean
         */
        static boolean isFibonacci(int n){
            /*A number is Fibonacci if and only if one or both of  5*n*n + 4 or 5*n*n - 4
            is a perfect square*/
            return isPerfectSquare(5*n*n + 4) ||
                    isPerfectSquare(5*n*n - 4);

        }

        static boolean isPerfectSquare(int x){
            int squareroot = (int)Math.sqrt(x);
            //System.out.println(squareroot);
            return (squareroot*squareroot == x);
        }
}
