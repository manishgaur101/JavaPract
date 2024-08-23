package com.designpatterns.abstractfactory;

public class BrowserManager {

    private BrowserManager() {
    }

    public static BrowserFactory getBrowserFactory(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return new ChromeFactory();
            case "firefox":
                return new FirefoxFactory();
            // Add more browsers as needed
            default:
                throw new IllegalArgumentException("Unknown browser type: " + browserType);
        }
    }
}
