package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
import java.util.stream.*;

public class CalendarMakeMyTrip {

        static final String close_PopUp = "//span[@class='commonModal__close']";
        static final String departure_Div = "//div[contains(@class,'flt_fsw_inputBox') and contains(@class,'dates') and not (contains(@class,'reDates'))]";

        static final String dayPicker_Month = "//div[@class='DayPicker-Month'][1]";
        static final String dayPicker_Caption = "./div[@class='DayPicker-Caption']/div";
        static final String btn_CalendarNxt = "//span[contains(@class,'DayPicker-NavButton--next')]";
        static String dateToSelect = "";
        static String dayPicker_Date = "//div[@class='DayPicker-Day']//p[text()='"+dateToSelect+"']";

        public static void selectCalendar(WebDriver driver, String Date, String Month, String Year) throws InterruptedException {
            //Click on Departure Calender div
            driver.findElement(By.xpath(departure_Div)).click();
            Thread.sleep(10000);

            //Scroll to the Calendar
            JavascriptExecutor js =  (JavascriptExecutor) driver;


            //Get the Current DayPicker Caption
            WebElement day_Picker =  driver.findElement(By.xpath(dayPicker_Month));
            js.executeScript("arguments[0].scrollIntoView(false);",day_Picker);
            String monthyear_Caption =  day_Picker.findElement(By.xpath(dayPicker_Caption)).getText();
            String[] monthyear_Array = monthyear_Caption.split(" ");
            String caption_Month = monthyear_Array[0];
            String caption_Year = monthyear_Array[1];

            //Condition to Check the Month and Year
            while(!(caption_Month.equals(Month) && caption_Year.equals(Year))){
                //click on Next Button
                driver.findElement(By.xpath(btn_CalendarNxt)).click();
                day_Picker =  driver.findElement(By.xpath(dayPicker_Month));
                monthyear_Caption =  day_Picker.findElement(By.xpath(dayPicker_Caption)).getText();
                monthyear_Array = monthyear_Caption.split(" ");
                caption_Month = monthyear_Array[0];
                caption_Year = monthyear_Array[1];
            }

            if(caption_Month.equals(Month) && caption_Year.equals(Year)){
                dateToSelect = Date;
                dayPicker_Date = "//div[@class='DayPicker-Day']//p[text()='"+dateToSelect+"']";
                System.out.println(dayPicker_Date);
                driver.findElement(By.xpath(dayPicker_Date)).click();
            }


        }


        public static void main(String[] args) throws InterruptedException {
            // Driver Initialize and open URL
            WebDriver driver = new ChromeDriver();
            String URL = "https://www.makemytrip.com/";
            driver.get(URL);
            driver.manage().window().maximize();

            //Close the pop up
            try {
                WebElement popup_CloseIcon = new WebDriverWait(driver, Duration.ofSeconds(40))
                        .until(ExpectedConditions.elementToBeClickable(By.xpath(close_PopUp)));
                popup_CloseIcon.click();
                System.out.println("Pop up closed.");
            }
            catch (Exception e){
                //e.printStackTrace();
                System.out.println("Pop up element not visible");
            }



            //Select Calendar
            String date = "12";
            String month = "November";
            String year = "2024";
            selectCalendar(driver,date,month,year);

        }
}
