package com.fileio.properties;

public class Runner {
    public static void main(String[] args) {
        System.out.println(ReadProperty.getValue("url"));
        System.out.println(ReadProperty.getValueByJava8("url"));
    }
}
