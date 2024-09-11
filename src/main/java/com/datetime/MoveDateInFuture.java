package com.datetime;

import java.time.LocalDate;

public class MoveDateInFuture {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //moving 30 days from current date
        LocalDate futureDate = currentDate.plusDays(30);
        System.out.println(futureDate);
    }
}
