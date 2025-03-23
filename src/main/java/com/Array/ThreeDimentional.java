package com.Array;

public class ThreeDimentional {

    int[][][] m = new int[2][][];

    int [] n = new int[10]; // This is allowed as it's simple values initialization.
    //compile error - Java does not allow complex initializations like multi-dimensional jagged arrays directly.
    //m[0] = new int[3][];

    /**
     * Instance arrays should be initialized inside a constructor or method.
     * Jagged arrays require step-by-step initialization, which can't be done in the class field directly.
     * @param args
     */

    public static void main(String [] args){
        ThreeDimentional obj = new ThreeDimentional(); // Object reference created
        obj.m[0] = new int[3][];

    }

}
