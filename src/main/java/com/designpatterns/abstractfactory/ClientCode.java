package com.designpatterns.abstractfactory;

import org.openqa.selenium.WebDriver;

public class ClientCode {
    public static void main(String[] args) {
        BrowserFactory factory  = BrowserManager.getBrowserFactory("chrome");
        WebDriver driver  = factory.createWebDriver();
        // Use the WebDriver to perform tests
        driver.get("https://www.example.com");

        // Quit the driver
        //driver.quit();
    }


}
