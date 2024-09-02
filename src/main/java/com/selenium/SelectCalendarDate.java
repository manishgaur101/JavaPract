package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SelectCalendarDate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        final String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        try{
            Thread.sleep(20000);
            String xpathClosePopup = "//span[@class='commonModal__close']";
            driver.findElement(By.xpath(xpathClosePopup)).click();
            System.out.println("Alert is dismissed");
        }
        catch(Exception e){
            System.out.println("Alert is not present.");
        }
        By xpath_Departure = By.xpath("//div[contains(@class,'dates')][1]");
        driver.findElement(xpath_Departure).click();
        Thread.sleep(20000);
        selectDate(driver, "March", "24", "2025");
        //driver.quit();
    }

    public static void selectDate(WebDriver driver, String month, String date, String year) throws InterruptedException {
        String xpathVisibleMonth = "//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption']/div";
        int predicate = 0;
        String buttonType = "";
        String navButtonXpath = "//span[contains(@class,'DayPicker-NavButton--next')]";

        //User input validation is pending


       /* Calendar calendar = Calendar.getInstance();
        int currentDay =  calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("target date:"+currentDay);
        int currentMonth =  calendar.get(Calendar.MONTH);
        System.out.println("target month:"+currentMonth);
        int currentYear =  calendar.get(Calendar.YEAR);
        System.out.println("target Year:"+currentYear);*/

        WebElement calenderMonthsYear = visibleMonths(xpathVisibleMonth, driver);
        List<String> visibleMonthValues = new ArrayList<>();
        String visibleMonth = calenderMonthsYear.getText().split(" ")[0];
        String visibleYear = calenderMonthsYear.getText().split(" ")[1];

        while(!(visibleMonth.equals(month) && visibleYear.equals(year))){

            driver.findElement(By.xpath(navButtonXpath)).click();
            Thread.sleep(10);
            calenderMonthsYear = visibleMonths(xpathVisibleMonth, driver);
            visibleMonth = calenderMonthsYear.getText().split(" ")[0];
            visibleYear = calenderMonthsYear.getText().split(" ")[1];
        }

        String xPathToSelect = "(//div[@class='DayPicker-Months']/div[@class='DayPicker-Month'])[1]//descendant::div[@class='DayPicker-Week']//following-sibling::div//descendant::div[@class='dateInnerCell']/p[contains(text()," + date + ")]";
        System.out.println(xPathToSelect);
        WebElement dateToSelect = driver.findElement(By.xpath(xPathToSelect));
        new Actions(driver).moveToElement(dateToSelect);
        dateToSelect.click();
    }

    public static WebElement visibleMonths(String xpathVisibleMonth, WebDriver driver){
        WebElement calenderMonths = driver.findElement(By.xpath(xpathVisibleMonth));
        return calenderMonths;
    }
}
