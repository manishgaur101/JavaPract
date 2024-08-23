package com.designpatterns.abstractfactory;

import com.enums.Constants;
import com.fileio.properties.ReadProperty;
import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class FirefoxFactory implements BrowserFactory {
    @Override
    public WebDriver createWebDriver() {
        return new FirefoxDriver((FirefoxOptions) createBrowserOptions());
    }

    @Override
    public AbstractDriverOptions createBrowserOptions() {
        FirefoxOptions options = new FirefoxOptions();
        String browserMode = ReadProperty.getValue(Constants.browsermode);
        if (browserMode.equalsIgnoreCase("no extention")) {
            options = new FirefoxOptions();
            // Set Firefox-specific options
            /**
             * below argument will - disable all add-ons, themes and custom settings.
             */
            options.addArguments("--safe-mode");
        }
        else if (browserMode.equalsIgnoreCase("none")){
            return options;
        }
        return options;
    }
}
