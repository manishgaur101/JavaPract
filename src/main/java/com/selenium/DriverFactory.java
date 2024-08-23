package com.selenium;

import com.enums.Constants;
import com.fileio.properties.ReadProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    static WebDriver driver = null;

    //private constructor to stop this class's instantiation from outside.
    private DriverFactory() {
    }

    public static WebDriver getDriverInstance(){
        String browserType = ReadProperty.getValue(Constants.browser);
        switch (browserType){
            case "chrome":
                driver = new ChromeDriver();
                return driver;
            case "firefox":
                driver = new FirefoxDriver();
                return driver;
            default:
                driver = new ChromeDriver();
                return driver;
        }
    }
}
