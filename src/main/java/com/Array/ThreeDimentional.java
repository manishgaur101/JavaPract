package com.Array;

public class ThreeDimentional {

    int[][][] m = new int[2][][];

    int [] n = new int[10]; // This is allowed as it's simple values initialization.
    //compile error - Java does not allow complex initializations like multi-dimensional jagged arrays directly.
    //m[0] = new int[3][];

    //Constructor
    ThreeDimentional(){
        m[0] = new int[3][];
        m[0][0] =  new int[1];
        m[0][1] = new int[2];
        m[0][2] = new int[3];
        m[1] = new int[2][2];
    }

    /**
     * Instance arrays should be initialized inside a constructor or method.
     * Jagged arrays require step-by-step initialization, which can't be done in the class field directly.
     * @param args
     */

    public static void main(String [] args){
        ThreeDimentional obj = new ThreeDimentional(); // Object reference created
        System.out.println(obj.m.length);
        System.out.println(obj.m[0].length);
        System.out.println(obj.m[0][0].length);
        System.out.println(obj.m[0][1].length);
        System.out.println(obj.m[0][2].length);

        //Assign values to 3D arrays
        int counter = 1;
        for(int i = 0; i < obj.m.length; i++){
            for(int j = 0; j < obj.m[i].length; j++){
                for(int k = 0; k < obj.m[i][j].length;k++){
                    obj.m[i][j][k] = counter++;
                }
            }
        }

        //Reading values from 3D array
        System.out.println("-------------------------- Printing 3d array values. ---------------------");
        for(int i = 0; i < obj.m.length; i++){
            for(int j = 0; j < obj.m[i].length; j++){
                for(int k = 0; k < obj.m[i][j].length;k++){
                    System.out.println("Value at ["+i+"]["+j+"]["+k+"] = "+ obj.m[i][j][k]);
                }
            }
        }

    }

}
