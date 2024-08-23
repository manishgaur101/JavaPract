package com.designpatterns.abstractfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;

public interface BrowserFactory {
    WebDriver createWebDriver();
    AbstractDriverOptions createBrowserOptions();
}
