package com.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertStringToSet {
    public static void main(String[] str)
    {
        String s = "Maan,Singh";
        System.out.println(usingCollection(s));
        System.out.println(usingStream(s));

        }


    private static Set usingStream(String s){
        // Below commented code convert to HashSet
        /*Set<String> result = Arrays.stream(s.split(""))
                .collect(Collectors.toSet());*/
        // Below return LinkedHashSet to maintain insertion order
        Set<String> result = Arrays.stream(s.split(""))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        return result;

    }

    private static Set usingCollection(String s){
        //LinkedHashSet maintains order
        return new LinkedHashSet(Arrays.asList(s.split("")));

    }
}
