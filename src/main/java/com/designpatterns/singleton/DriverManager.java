package com.designpatterns.singleton;

import com.selenium.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum DriverManager {
    INSTANCE;

    private WebDriver driver;
    DriverManager() {
        //Instantiate WebDriver
        /**If Using Selenium3 WebDriver Manager
         * WebDriverManager.chromeDriver().setup();
         * WebDriver driver = new ChromeDriver();
         */

        /** If I have a DriverFactory for encapsulation purpose usind Driver Factory pattern -
         * this.driver = DriverFactory.getDriverInstance();
         */
        this.driver = new ChromeDriver();

    }

    public WebDriver getDriver(){
        return driver;
    }

    public void quitDriver(){
        if(driver != null) {
            driver.quit();
        }
    }
}
