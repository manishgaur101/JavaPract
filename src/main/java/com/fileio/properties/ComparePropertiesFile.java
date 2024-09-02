package com.fileio.properties;

import java.util.*;

public class ComparePropertiesFile {
    public static void main(String[] args){
        Properties prop1 = new Properties();
        Properties prop2 = new Properties();

        //If Properties file is already present then create FileInputStream else feed data like below

        // We can also use setProperty method here in place of put()
        prop1.put("url","www.google.com");
        prop2.put("url","www.google.com");

        prop1.put("username","manish");
        prop2.put("username","");

        //Need to load the properties file if already created with the FileInputStream else not required.

        //Compare the properties files
        Set<String> allKeys =  new HashSet<>();
        allKeys.addAll(prop1.stringPropertyNames());
        allKeys.addAll(prop2.stringPropertyNames());
        System.out.println(allKeys);

        //Compare the values
        for(String key : allKeys){
            String value1 =  prop1.getProperty(key);
            String value2 =  prop2.getProperty(key);

            if(!value1.equals(value2)){
                System.out.println("Both Files has different values for key: "+key);
                System.out.println(" file1: " +value1);
                System.out.println(" file1: " +value2);

            }
        }

    }
}
