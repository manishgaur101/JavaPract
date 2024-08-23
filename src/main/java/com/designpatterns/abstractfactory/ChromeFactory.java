package com.designpatterns.abstractfactory;

import com.enums.Constants;
import com.fileio.properties.ReadProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class ChromeFactory implements BrowserFactory {
    @Override
    public WebDriver createWebDriver() {
        return new ChromeDriver((ChromeOptions) createBrowserOptions());
    }

    @Override
    public AbstractDriverOptions createBrowserOptions() {
        ChromeOptions options = new ChromeOptions();
        String browserMode = ReadProperty.getValue(Constants.browsermode);
        if (browserMode.equalsIgnoreCase("no extention")) {
            // Set Chrome-specific options

            /**
             * It will disable all extentions only and not themes and other settings.
             * So Both firefox argument and this argument somehow servers the same purpose.
             */
            options.addArguments("--disable-extensions");

        }
        else if (browserMode.equalsIgnoreCase("none")){
            return options;
        }
        return options;
    }
}
