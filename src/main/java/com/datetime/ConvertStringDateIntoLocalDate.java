package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ConvertStringDateIntoLocalDate {
    public static void main(String[] args){
        String date =  "07-Feb-25";
        //String date = "2025-02-07";
        // since date is in yyyy-MM-dd format while pattern is in Sep-25 like format it will give error
        //String pattern  =  "MMM-yy";
        String pattern  =  "dd-MMM-yy";

        //convertWithoutDateTimeFormatter(date);
        convertWithDateTimeFormatter(date,pattern);


    }

    public static void convertWithDateTimeFormatter(String date,String formatType){
        try{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatType);
        LocalDate dateLocal  =  LocalDate.parse(date,formatter);
        System.out.println(dateLocal);}
        catch(DateTimeParseException e){System.err.println("Invalid date format: " + e.getMessage());}

    }

    public static void convertWithoutDateTimeFormatter(String date){
        try{
            //Converting String Date into LocalDate format without any external formatting
            // If we want to convert without DateTimeFormatter then the String date must be in this format - yyyy-MM-dd
            // else DateTimeParseException will come.
            LocalDate dateLocal = LocalDate.parse(date);
            System.out.println(dateLocal);}
        catch(DateTimeParseException e){System.err.println("Invalid date format: " + e.getMessage());}
    }

}
