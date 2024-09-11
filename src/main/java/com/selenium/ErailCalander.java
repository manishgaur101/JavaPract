package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ErailCalander {
    static WebDriver driver = null;

    //===========================Locators===============================
    static By id_Calander_div = By.id("//div[@id='divCalender']");
    static By calendars = By.xpath("//div[@id='divCalender']//table[@class='WithBorder']/tbody/tr[1]/td");
    static String dateTarget = "19";
    static String monthToSelect = "Jan";
    static String yearToSelect = "25";
    static String dateToSelect = ".//tr/td[text()='"+dateTarget+"']";
    static String xpath_Month = ".//table[@class='Month']/tbody/tr[1]/td";
    static String btn_xpath_DepartureDate = "//input[@type='button' and @title='Select Departure date for availability']";
    static String xpath_DepartureMonth = "//div[@id='divCalender']//table[@class='Month']/tbody/tr[1]/td";
    static String nav_back_date = "//td[@id='tdDateFromTo']/a[1]";

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://erail.in/";
        visit(driver,url);
        selectDate_Calendar(driver,monthToSelect,dateTarget,yearToSelect);
    }

    public static void visit(WebDriver driver, String url){
        driver.get(url);
    }

    /** This fxn Tries below action but this does not work. - so better to opt for directly select date from calendar.
     * This fxn tries to change the value of the btn where date shows but it does not select the date on calendar
     * So this fxn further tries to click on nav button but this just navigates from today's date.
     * @param driver
     */
    public static void selectDate_Via_nav(WebDriver driver ){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].value='31-Jan-25 Fri'",driver.findElement(By.xpath(btn_xpath_DepartureDate)));
        //Thread.sleep(10000);
        driver.findElement(By.xpath(btn_xpath_DepartureDate)).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath(nav_back_date)).click();
    }

    public static void selectDate_Calendar(WebDriver driver,String month, String date, String year){
        driver.findElement(By.xpath(btn_xpath_DepartureDate)).click();
        List<WebElement> allCalendars =  driver.findElements(calendars);

        for(WebElement eachCalendar : allCalendars){
            WebElement monthsyr = eachCalendar.findElement(By.xpath(xpath_Month));
            String str_visible_MonthYear = monthsyr.getText();
            String[] array_VisibleMonthYear = str_visible_MonthYear.split("-");
            String visibleMonth =  array_VisibleMonthYear[0];
            String visibleYear =  array_VisibleMonthYear[1];

            if(visibleMonth.equals(month) && visibleYear.equals(year)){
                eachCalendar.findElement(By.xpath(dateToSelect)).click();
                break;
            }
        }
    }
}
