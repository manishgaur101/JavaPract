package com.selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class OpenUrlTakeScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        //screenshotBase64(driver);
        System.out.println(System.getProperty("user.dir"));
        String path =  System.getProperty("user.dir")+"\\src\\test\\resources"+"\\screenshot\\screenshot.png";
        screenshotFile(driver,path);

    }

    public static void screenshotBase64(WebDriver driver){
        String base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        System.out.println(base64Screenshot);
    }

    public static void screenshotFile(WebDriver driver, String path){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileHandler.copy(screenshot,new File(path));
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
