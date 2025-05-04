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


        System.out.println("Student with Highest Marks:" + highestMarksStudents(iMap));

    }

    private static Map<Integer, List<String>> highestMarksStudents(Map<String,Integer> map){
        Map<Integer, List<String>> resultMap =  new LinkedHashMap<>();
        List<String> studentList =  new ArrayList<>();

        //Loop Over Map
        int highestMarks = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > highestMarks){
                highestMarks = entry.getValue();
                studentList.clear();
                studentList.add(entry.getKey());
            }
            else if(entry.getValue() == highestMarks){
                studentList.add(entry.getKey());
            }
            resultMap.put(highestMarks,studentList);
        }
        return resultMap;
    }
}
