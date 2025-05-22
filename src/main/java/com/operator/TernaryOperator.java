package com.operator;

/**
 * ternary (?:) operator
 * The ternary operator is an expression, not a control structure.
 * Both truePart and falsePart in condition ? truePart : falsePart must be expressions that return a value,
 * not statements like System.out.println()
 */
public class TernaryOperator {
    public static void main(String[] arg){
        String s = "Manish";
        //Incorrect way of using - Compile time error
        //s.toCharArray() instanceof char[] ? System.out.println() : System.out.println();

        //Correct way
        String result = (s.toCharArray() instanceof char[]) ? "Yes" : "No";
        System.out.println(result);
    }
}
