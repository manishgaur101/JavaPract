package com.fileio.apachepoi;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExcelRead {
    public static void main(String[] args) {
        readExcel();

    }

    @DataProvider(name="excelData")
    public static String[][] readExcel(){
        File file;
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        String[][] data = null;
        // Create a file reference
        try {
            file = new File(System.getProperty("user.dir") + "\\test.xlsx");

            // Read raw data from file using FileInputStream
            fis = new FileInputStream(file);

            //Convert raw data into excel form
            workbook = new XSSFWorkbook(fis);

            //Get the sheet
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Go to Row then cell and get the cell value - hardcoded way
            System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
            System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());

            //Go to Row then cell and get the cell value - dynamic way
            //This way we will get NullPointerException if any middle column does not have any value.
            try {
                int rowCount = sheet.getPhysicalNumberOfRows(); // will return row count including header
                System.out.println("Number of total rows present: " + rowCount);
                System.out.println("Row count without header: " + sheet.getLastRowNum());
                for (int i = 0; i < rowCount; i++) {
                    XSSFRow row = sheet.getRow(i);
                    int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();
                    for (int j = 0; j < cellCount; j++) {
                        XSSFCell cell = row.getCell(j);
                        //identify the cell value type
                        String cellValue = getCellValue(cell);
                        System.out.print("||" + cellValue);
                    }
                    System.out.println();
                }
            }
            catch (NullPointerException e){
                System.out.println("\n Some middle column have no data.");
            }

            // No need to have a different method we can use DataFormatter to format any kind of sheet data into String
            //This way we will not get NullPointerException if any of the middle column have no data.

            int rowCount1  = sheet.getPhysicalNumberOfRows(); // will return row count including header
            int totalCellCount = sheet.getRow(0).getLastCellNum(); // will return column count
            data = new String[rowCount1-1][totalCellCount];

            System.out.println("Number of total rows present: "+ rowCount1);
            System.out.println("Row count without header: "+sheet.getLastRowNum());

            for (int i = 0; i < rowCount1-1 ; i++) {
                XSSFRow row = sheet.getRow(i);
                for (int j = 0; j < totalCellCount; j++) {
                    DataFormatter df = new DataFormatter();
                    System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
                    data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
                }
                System.out.println();
            }
            for (String[] datum : data) {
                System.out.println(Arrays.toString(datum));
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //Close the workbook and Stream
            try{
                workbook.close();
                fis.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return data; // Best practice to return after try-catch-finally
    }

    private static String getCellValue(XSSFCell cell) {
        if(cell.getCellType()== CellType.NUMERIC){
            return String.valueOf(cell.getNumericCellValue());

        } else if (cell.getCellType()== CellType.BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        }
        else if (cell.getCellType()== CellType.STRING){
            return cell.getStringCellValue();
        }
        else {
            return cell.getStringCellValue();
        }
    }
}
