package com.selenium;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErailAssignment {

    static final XSSFWorkbook book = null;
    static final XSSFSheet sheet = null;
/*    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://erail.in/";
        String path = System.getProperty("user.dir") +"\\"+"expected.xlsx";
        driver.get(URL);

        //Locators
        By id_From = By.id("txtStationFrom");
        String xpath_From_autocomplete_divs = "(//div[@class='autocomplete'])[1]/div";

        //step2 - Click on from field
        WebElement fromField = driver.findElement(id_From);
        fromField.click();

        //step 3 - Clear data from FROM field
        fromField.clear();

        //step4 - Insert data DEL into field
        fromField.sendKeys("DEL");

        //Step 5 - printing the fourth value from autocomplete div
        List<WebElement> from_List =  driver.findElements(By.xpath(xpath_From_autocomplete_divs));
        List<String> from_Attribute = new ArrayList<>();
        from_List.get(3).click();
        int from_field_Size = from_List.size();
        System.out.println(from_List.get(3).getAttribute("title"));

        //step 6 - Creating excel and putting all From field actual data in it.
        for(int i = 0; i< from_field_Size; i++){
            from_Attribute.add(from_List.get(i).getAttribute("title"));
        }
        System.out.println(from_Attribute);
        excelCreation(from_field_Size,0,from_Attribute);

        //Step 7 - Compare expected and actual excels
        String[][] data =  readExcel(path);

    }*/

    //@Test(dataProvider="getData")
    //@Test
    public void compareData(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://erail.in/";

        driver.get(URL);

        //Locators
        By id_From = By.id("txtStationFrom");
        String xpath_From_autocomplete_divs = "(//div[@class='autocomplete'])[1]/div";

        //step2 - Click on from field
        WebElement fromField = driver.findElement(id_From);
        fromField.click();

        //step 3 - Clear data from FROM field
        fromField.clear();

        //step4 - Insert data DEL into field
        fromField.sendKeys("DEL");

        //Step 5 - printing the fourth value from autocomplete div
        List<WebElement> from_List =  driver.findElements(By.xpath(xpath_From_autocomplete_divs));
        List<String> from_Attribute = new ArrayList<>();
        from_List.get(3).click();
        int from_field_Size = from_List.size();
        System.out.println(from_List.get(3).getAttribute("title"));

        //step 6 - Creating excel and putting all From field actual data in it.
        for(int i = 0; i< from_field_Size; i++){
            from_Attribute.add(from_List.get(i).getAttribute("title"));
        }
        System.out.println(from_Attribute);
        excelCreation(from_field_Size,0,from_Attribute);

        //Step 7 - Compare expected and actual excels
        List<String> expectedData =  new ArrayList<>(Arrays.asList(readExcel()));
        if(!(from_Attribute.size()==expectedData.size())){
            System.out.println("Failed");
        }
        List<String> result = new ArrayList<>();
        int k = 0;
        while(k< expectedData.size()){
            if(!(expectedData.get(k).equals(from_Attribute.get(k)))){
                result.add("FAIL");
            }
            else{
                result.add("PASS");
            }
            k++;
        }
        System.out.println(result);

    }

    public static void updateExcel(XSSFWorkbook wb, XSSFSheet sheet, int row, int column, List<String> result){

    }

    public static void excelCreation(int row, int column,List<String> fromAttribute){
        String path = System.getProperty("user.dir") +"\\"+"erail_actual.xlsx";
        FileOutputStream fos = null;

        // Create a WorkBook
        XSSFWorkbook book = new XSSFWorkbook();

        // Create a Sheet in this workbook
        XSSFSheet sheet  = book.createSheet();

        //create row in sheet and set values in columns
        for(int i = 0; i< row; i++){
            sheet.createRow(i);
            for(int j = 0 ; j <= column; j++){
                sheet.getRow(i).createCell(j).setCellValue(fromAttribute.get(i));
            }
        }

        //Write all data into File
        try {
            fos = new FileOutputStream(path);
            book.write(fos);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                book.close();
                fos.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //@DataProvider(name="getData")
    public static String[] readExcel(){
        String path = System.getProperty("user.dir") +"\\"+"expected.xlsx";
        String[] expected = null;
        FileInputStream fis = null;
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.getSheet("Sheet1");

        try {
            fis = new FileInputStream(path);
            int rowCount = sheet.getPhysicalNumberOfRows();
            int columnCount =  sheet.getRow(0).getLastCellNum();
            System.out.println("Number of total rows present: "+ rowCount);
            System.out.println("Row count without header: "+sheet.getLastRowNum());
            System.out.println("Last count value: "+columnCount);

            expected = new String[rowCount-1];

            for(int i = 0; i< rowCount-1; i++){
                for(int j=0; j<columnCount-1; j++){
                    DataFormatter df =  new DataFormatter();
                    System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
                    expected[i] =  df.formatCellValue(sheet.getRow(i).getCell(j));
                }
                System.out.println();
            }

            for (String datum : expected) {
                System.out.println(datum);
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
            wb.close();
            fis.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return expected;
    }
}
