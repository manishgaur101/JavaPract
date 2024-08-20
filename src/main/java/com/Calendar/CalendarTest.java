package com.Calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));


        System.out.println(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedDate  = LocalDate.now().format(formatter);
        System.out.println(formattedDate);


    }
}
