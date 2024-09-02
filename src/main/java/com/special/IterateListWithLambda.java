package com.special;

import java.util.*;

public class IterateListWithLambda {
    public static void main(String[] str){
        List<String> iList =  new ArrayList<>(Arrays.asList("manish","gaur","india"));
        iList.stream()
                .forEach(e->System.out.println(e));
    }
}
