package com.fileio.apachepoi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.Boolean.TRUE;

public class ExcelWrite {
    public static void main(String[] args) {
        writeExcel();
    }

    public static void writeExcel(){

        File file;
        FileOutputStream fos = null;

        //Create Workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Create the sheet under workbook
        XSSFSheet sheet = workbook.createSheet();
        //Create row
        sheet.createRow(0);
        //Create cell in the row and set some value
        sheet.getRow(0).createCell(0).setCellValue("Name");
        sheet.getRow(0).createCell(1).setCellValue("Age");
        sheet.getRow(0).createCell(2).setCellValue("IsActive");

        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("MANISH");
        sheet.getRow(1).createCell(1).setCellValue("36");
        sheet.getRow(1).createCell(2).setCellValue(TRUE);

        sheet.createRow(2);
        sheet.getRow(2).createCell(0).setCellValue("Rina");
        sheet.getRow(2).createCell(1).setCellValue("31");

        sheet.createRow(3);
        sheet.getRow(3).createCell(0).setCellValue("Rina");
        sheet.getRow(3).createCell(2).setCellValue("FALSE");


        //Write all data into File
        System.out.println(System.getProperty("user.dir"));
        try {
            String path = System.getProperty("user.dir") +"\\"+"test.xlsx";
            file = new File(path);

            fos = new FileOutputStream(file);
            workbook.write(fos);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                workbook.close();
                fos.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
