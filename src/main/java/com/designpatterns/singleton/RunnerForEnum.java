package com.designpatterns.singleton;

import com.enums.Constants;
import com.fileio.properties.ReadProperty;
import org.openqa.selenium.WebDriver;

public class RunnerForEnum {
    public static void main(String[] args) {
        WebDriver driver = DriverManager.INSTANCE.getDriver();
        driver.get(ReadProperty.getValue(Constants.url));
        DriverManager.INSTANCE.quitDriver();
    }

}
