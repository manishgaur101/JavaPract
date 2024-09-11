package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {

        //Finding current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Format in 02-Sep-2024
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String string1 = currentDate.format(formatter);
        System.out.println(string1);

        //Format in 02-September-2024
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String string2 = currentDate.format(formatter1);
        System.out.println(string2);

        //Format in 02 September 2024
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String string3 = currentDate.format(formatter2);
        System.out.println(string3);


    }
}
