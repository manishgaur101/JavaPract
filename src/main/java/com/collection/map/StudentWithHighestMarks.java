package com.collection.map;

import java.util.*;
import java.util.stream.*;

public class StudentWithHighestMarks {
    public static void main(String[] arg){
        //Student map
        Map<String,Integer> iMap = new HashMap<>(Map.of("manish",19,"vikas",32,"abhinav",32));

        List<String> iList =  new ArrayList<>();

        int maxMarks  = 0;

        for(Map.Entry<String,Integer> entry : iMap.entrySet()){
            if(entry.getValue() > maxMarks){
                maxMarks =  entry.getValue();
            }
        }

        for(Map.Entry<String,Integer> entry : iMap.entrySet()){
            if(entry.getValue() == maxMarks){
                iList.add(entry.getKey());
            }
        }

        System.out.println("Following students get the highest marks:\n"+iList);

    }
}
