package com.special;

import java.util.stream.*;
import java.util.*;

public class RearrangeArray {
    public static void  main(String[] str){
        int[] a =  {10,20,30,40,50,60,70};
        //Expected [50,60,70,10,20,30,40]
        int index = 4;
        IntStream b = Arrays.stream(a,index,a.length);
        IntStream c = Arrays.stream(a,0,index);

        Stream.concat(b.boxed(),c.boxed())
                .forEach(e->System.out.print(e+","));

    }
}
