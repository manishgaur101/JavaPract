package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class FetchSelectedRadioBtnValue {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        String xpath_Radio_Regular = "//div[contains(@class,'gap8')]//descendant::div[contains(@class,'appendBottom3') and contains(text(),'Regular')]";
        String xpath_Radio_Student = "//div[contains(@class,'gap8')]//descendant::div[contains(@class,'appendBottom3') and contains(text(),'Student')]";
        String xpath_Radio_Senior = "//div[contains(@class,'gap8')]//descendant::div[contains(@class,'appendBottom3') and contains(text(),'Senior Citizen')]";
        String xpath_Radio_Armed = "//div[contains(@class,'gap8')]//descendant::div[contains(@class,'appendBottom3') and contains(text(),'Armed Forces')]";
        String xpath_Radio_Doctors = "//div[contains(@class,'gap8')]//descendant::div[contains(@class,'appendBottom3') and contains(text(),'Nurse')]";

        try{
            Thread.sleep(20000);
            String xpathClosePopup = "//span[@class='commonModal__close']";
            driver.findElement(By.xpath(xpathClosePopup)).click();
            System.out.println("Alert is dismissed");
        }
        catch(Exception e){
            System.out.println("Alert is not present.");
        }

        selectRadioBtn(xpath_Radio_Student,driver);

        // xpath of parent div under which all radio button's are defined.
        String xpathRadioGroup =  "//div[contains(@class,'gap8')]";
        WebElement radioGrp = driver.findElement(By.xpath(xpathRadioGroup));

        // xpath to select all radio buttons of above parent div.
        String xpathRadioBtnInGrp =  "//div[contains(@class,'gap8')]//descendant::input";
        List<WebElement> allRadio =  driver.findElements(By.xpath(xpathRadioBtnInGrp));

        // Looping over all radio buttons and checking which is selected then fetching it's value.
        // Below code is only good enough for basic radio buttons but this is not basic.
        for(WebElement element : allRadio){
            if(element.isSelected()){
                String selectedRadioText = element.getAttribute("value");
                System.out.println(selectedRadioText);
            }
        }

        //So we need to think something else
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        List<WebElement> targetDiv =driver.findElements(By.xpath("//div[contains(@class,'gap8')]//descendant::div[contains(@class,'appendBottom3')]"));
        for(WebElement element : targetDiv){
            //Fetching the color property of style of element.
            String color = (String) js.executeScript("return window.getComputedStyle(arguments[0]).getPropertyValue('color');", element);
            //System.out.println(color);

            // fetching first value of rgb which points redColor
            String redValue = (String) js.executeScript(
                    "var rgb = arguments[0].match(/\\d+/g); return rgb[0];", color);
            //System.out.println(redValue);

            if(redValue.equals("0")){
                System.out.println("Selected radio button value is: "+element.getText());
            }

        }
    }

    public static void selectRadioBtn(String xpath,WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        }
        catch (TimeoutException e){
            System.out.println("Radio button is not visible within 10 seconds.");
        }
        //driver.quit();
    }
}
