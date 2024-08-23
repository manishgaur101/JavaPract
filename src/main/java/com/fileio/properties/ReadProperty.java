package com.fileio.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;

public final class ReadProperty {

    private ReadProperty() {
    }

    //This way is suitable as using java8 does not seem much useful
    public static String getValue(Enum key){
        String value = "";
        // Create Properties object
        Properties prop = new Properties();

        //FileInputStream for the property
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testconfig.properties");
            //load the FileInputStream into Property
            prop.load(file);
        }
        catch (IOException e){e.printStackTrace();}
        //get the property value
        value = prop.getProperty(String.valueOf(key));// If key not found then null will be returned.
        if(Objects.isNull(value)){
            throw new RuntimeException();
        }
        return value;
    }

    public static String getValueByJava8(Enum keyValue){
        String value = "";
        //Create Properties object
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/testconfig.properties"));
        }
        catch (IOException e){e.printStackTrace();}
        //functional interface
        Function<String,String> getProperty = key -> prop.getProperty(key);
        value  =  getProperty.apply(String.valueOf(keyValue));
        if(Objects.isNull(value)){
            throw new RuntimeException("Key not present, check config.properties.");
        }
        return value;
    }
}
