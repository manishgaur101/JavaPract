package com.special;

import java.util.*;

public class BalancingParentheses {
    public static void main(String[] args){
        //Given String
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        String input3 = "({[]})";
        String input4 = "[(])";
        String input5 = "[()]{}{[()()]()}";
        System.out.println("Is Input1 balanced: "+isBalanced(input1));
        System.out.println("Is Input2 balanced: "+isBalanced(input2));
        System.out.println("Is Input3 balanced: "+isBalanced(input3));
        System.out.println("Is Input4 balanced: "+isBalanced(input4));
        System.out.println("Is Input5 balanced: "+isBalanced(input5));

    }

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        //Loop over String
        for(char c : s.toCharArray()){
            //If opening bracket - Push the element in Stack
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }//If closing bracket
            else if(c==')' || c=='}' || c==']')
            {
                // check if stack is empty or not.
                if(stack.empty()){
                    return false;
                }// Check if closing paranthesis have the corresponding opening paranthesis at top of stack or not
                char topElement = stack.pop();
                if(c==')' && topElement != '(' || c=='}' && topElement != '{' || c==']' && topElement != '['){
                    return false;
                }
            }
        }

        // end of the loop, stack must be empty to be balanced else not balanced
        return stack.empty();
    }
}
