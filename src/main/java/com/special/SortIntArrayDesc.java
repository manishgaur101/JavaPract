package com.special;

import java.util.stream.*;
import java.util.*;

public class SortIntArrayDesc {
    public static void main(String[] args){
        //boxed() is necessary coz sorted() fxm does natural sorting for primitive numbers and
        // for reverse sorting IntStream should be converted to Object Stream then only
        //Comparator.reverseOrder() will be allowed to sorted method.
        IntStream.of(10,20,3,5,21,13,67,89,8).boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(e->System.out.println(e));

    }
}
