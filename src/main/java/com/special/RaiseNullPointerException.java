package com.special;

import java.util.*;

public class RaiseNullPointerException {
    public static void main(String[] args){
        // local variables are not initialized automatically like instance or static variables so must be initialized
        String s = null;
        //String s = "123";
        //Below will give NPE
        //System.out.println(s.length());

        // To Avoid Null POINTER Exception use Objects.isNull()
        if(Objects.isNull(s)){
            System.out.println("Given String is null.");
        }

        else
        {
            System.out.println(s.length());
        }
    }
}
