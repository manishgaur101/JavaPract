package com.fileio.properties;

import com.enums.Constants;

public class Runner {
    public static void main(String[] args) {
        System.out.println(ReadProperty.getValue(Constants.url));
        System.out.println(ReadProperty.getValueByJava8(Constants.url));
    }
}
